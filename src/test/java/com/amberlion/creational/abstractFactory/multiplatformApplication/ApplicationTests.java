package com.amberlion.creational.abstractFactory.multiplatformApplication;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTests {

    @Test
    public void configureApplicationWindows() {
        Application app = Application.configureApplication("windows");

        Assert.assertEquals(app.getButton().getOS(), "windows");
        Assert.assertEquals(app.getCheckbox().getOS(), "windows");
    }
    @Test
    public void configureApplicationMacOS() {
        Application app = Application.configureApplication("macOS");

        Assert.assertEquals(app.getButton().getOS(), "macOS");
        Assert.assertEquals(app.getCheckbox().getOS(), "macOS");
    }
    @Test
    public void configureApplicationLinux() {
        Application app = Application.configureApplication("linux");

        Assert.assertEquals(app.getButton().getOS(), "linux");
        Assert.assertEquals(app.getCheckbox().getOS(), "linux");
    }

}