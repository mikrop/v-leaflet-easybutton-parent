package org.vaadin.addon.leaflet.easybutton.client;

import org.peimari.gleaflet.client.control.Control;
import org.vaadin.addon.leaflet.easybutton.client.resources.LeafletEasyButtonResourceInjector;

public class EasyButton extends Control {

	static {
        LeafletEasyButtonResourceInjector.ensureInjected();
	}

	protected EasyButton() {}
	
	public static native EasyButton create(EasyButtonOptions options)
	/*-{
        return new $wnd.L.Control.EasyButtons(options);
	}-*/;

}
