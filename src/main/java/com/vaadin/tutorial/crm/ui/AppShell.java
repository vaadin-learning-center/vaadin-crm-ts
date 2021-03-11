package com.vaadin.tutorial.crm.ui;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;


@Theme(value = "vaadin-crm")
@PWA(name = "Vaadin CRM",
     shortName = "CRM",
     offlineResources = {
        "./styles/offline.css",
        "./images/offline.png"
     }
)
public class AppShell implements AppShellConfigurator {
}
