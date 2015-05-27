package org.vaadin.addon.leaflet.easybutton.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletEasyButtonClientBundle extends ClientBundle {

    @Source("easy-button.js")
    @DoNotEmbed
    TextResource script();

}
