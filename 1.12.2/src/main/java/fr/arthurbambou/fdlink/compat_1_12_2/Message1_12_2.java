package fr.arthurbambou.fdlink.compat_1_12_2;

import fr.arthurbambou.fdlink.versionhelpers.minecraft.Message;
import fr.arthurbambou.fdlink.versionhelpers.minecraft.style.Style;

import java.util.ArrayList;
import java.util.List;

public class Message1_12_2 implements Message {

    private String message;
    private Style style = Style.EMPTY;
    private TextType type;
    private String key;
    private List<Message> sibblings = new ArrayList<>();
    private Object[] args;

    public Message1_12_2(String message) {
        this.message = message;
        this.type = TextType.LITERAL;
    }

    public Message1_12_2(String key, String message, Object... args) {
        this.key = key;
        this.message = message;
        this.args = args;
        this.type = TextType.TRANSLATABLE;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Style getStyle() {
        return this.style;
    }

    @Override
    public Message1_12_2 setStyle(Style style) {
        this.style = style;
        return this;
    }

    @Override
    public MessageObjectType getType() {
        return MessageObjectType.TEXT;
    }

    @Override
    public TextType getTextType() {
        return this.type;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public Object[] getArgs() {
        return this.args;
    }

    @Override
    public List<Message> getSibblings() {
        return this.sibblings;
    }

    @Override
    public Message1_12_2 addSibbling(Message message) {
        this.sibblings.add(message);
        return this;
    }
}
