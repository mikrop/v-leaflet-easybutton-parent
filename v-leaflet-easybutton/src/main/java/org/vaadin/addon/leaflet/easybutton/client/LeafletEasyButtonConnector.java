package org.vaadin.addon.leaflet.easybutton.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easybutton.LEasyButton;

@Connect(LEasyButton.class)
public class LeafletEasyButtonConnector extends AbstractDefaultControl {

    @Override
    protected EasyButton createControl() {
        EasyButtonOptions options = EasyButtonOptions.create();
        options.setTitle("Interact with the document");
        options.setIntendedIcon("fa-circle-o");
        EasyButton result = EasyButton.create(options);
        getMap().addControl(result);
        return result;
    }

    @Override
    protected EasyButton getControl() {
        return (EasyButton) super.getControl();
    }

}