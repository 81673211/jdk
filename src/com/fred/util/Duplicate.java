package com.fred.util;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public final class Duplicate {

    private Duplicate() {
    }

    public static void checkDuplicate(String path) throws IOException {
        final Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
        Set<String> files = new HashSet<>();
        while (resources.hasMoreElements()) {
            final URL url = resources.nextElement();
            final String file = url.getFile();
            if (file != null && file.length() > 0) {
                files.add(file);
            }
        }
        if (files.size() > 1) {
            //TODO
        }
    }
}
