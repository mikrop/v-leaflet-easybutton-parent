package org.vaadin.addon.leaflet.easybutton.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * options: {
     position: 'topleft',
     title: '',
     intendedIcon: 'fa-circle-o'
 * }
 */
public class EasyButtonOptions extends JavaScriptObject {

    protected EasyButtonOptions() {}

    public static native EasyButtonOptions create() /*-{
        return {};
    }-*/;

    public native final void setTitle(String title)	/*-{
        this.title = title;
    }-*/;

    public native final void setIntendedIcon(String intendedIcon) /*-{
        this.intendedIcon = intendedIcon;
    }-*/;

}
