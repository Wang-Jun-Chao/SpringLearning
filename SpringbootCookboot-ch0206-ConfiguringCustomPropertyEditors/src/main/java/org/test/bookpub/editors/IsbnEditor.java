package org.test.bookpub.editors;

import org.springframework.util.StringUtils;
import org.test.bookpub.entity.Isbn;

import java.beans.PropertyEditorSupport;

/**
 * Note
 * It is VERY important to know that PropertyEditor is not thread safe!
 * For this reason, we have to create a new instance of our custom editors for every web
 * request and register them with WebDataBinder.
 * In case a new PropertyEditor is needed, it is best to create one by extending
 * PropertyEditorSupport and overriding the desired methods with custom
 * implementation.
 *
 * Author: 王俊超
 * Date: 2017-04-10 07:41
 * All Rights Reserved !!!
 */
public class IsbnEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            setValue(new Isbn(text.trim()));
        } else {
            setValue(null);
        }
    }

    @Override
    public String getAsText() {
        Isbn isbn = (Isbn) getValue();
        if (isbn != null) {
            return isbn.getIsbn();
        } else {
            return "";
        }
    }
}