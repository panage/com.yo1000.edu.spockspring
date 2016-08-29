package com.yo1000.selfstudy.spockspring.model;

import java.util.Date;

/**
 * @author yo1000
 */
public class Word {
    private String text;
    private Date created;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
