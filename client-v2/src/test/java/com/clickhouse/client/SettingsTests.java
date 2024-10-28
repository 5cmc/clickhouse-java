package com.clickhouse.client;

import com.clickhouse.client.api.ClientSettings;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SettingsTests {

    @Test
    void testClientSettings() {
        List<String> source = Arrays.asList("ROL1", "ROL2,☺", "Rol,3,3");
        String listA = ClientSettings.commaSeparated(source);
        List<String> listB = ClientSettings.valuesFromCommaSeparated(listA);
        Assert.assertEquals(listB, source);
    }
}
