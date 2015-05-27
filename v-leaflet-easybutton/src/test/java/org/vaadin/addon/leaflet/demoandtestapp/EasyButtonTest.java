package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.easybutton.LEasyButton;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.ControlPosition;
import org.vaadin.addonhelpers.AbstractTest;

public class EasyButtonTest extends AbstractTest {

    @Override
    public String getDescription() {
        return "Test easybutton control";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");

        LEasyButton control = new LEasyButton();
        control.setPosition(ControlPosition.topleft);
//        control.setEnabled(false);
        leafletMap.addControl(control);

        return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
