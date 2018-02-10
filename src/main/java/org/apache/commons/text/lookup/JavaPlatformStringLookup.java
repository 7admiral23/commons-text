/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.commons.text.lookup;

import java.util.Locale;

/**
 * Looks up keys related to Java: Java version, JRE version, VM version, and so on.
 * 
 * @since 1.3
 */
public final class JavaPlatformStringLookup extends AbstractStringLookup {

    /**
     * Defines the singleton for this class.
     */
    public static final JavaPlatformStringLookup INSTANCE = new JavaPlatformStringLookup();

    /**
     * No need to build instances for now.
     */
    private JavaPlatformStringLookup() {
        // empty
    }

    /**
     * Accessible through the Lookup key {@code hardware}.
     * @return hardware processor information.
     */
    public String getHardware() {
        return "processors: " + Runtime.getRuntime().availableProcessors() + ", architecture: "
                + getSystemProperty("os.arch") + this.getSystemProperty("-", "sun.arch.data.model")
                + this.getSystemProperty(", instruction sets: ", "sun.cpu.isalist");
    }

    /**
     * Accessible through the Lookup key {@code locale}.
     * @return system locale and file encoding information.
     */
    public String getLocale() {
        return "default locale: " + Locale.getDefault() + ", platform encoding: " + getSystemProperty("file.encoding");
    }

    /**
     * Accessible through the Lookup key {@code os}.
     * @return operating system information.
     */
    public String getOperatingSystem() {
        return getSystemProperty("os.name") + " " + getSystemProperty("os.version")
                + getSystemProperty(" ", "sun.os.patch.level") + ", architecture: " + getSystemProperty("os.arch")
                + getSystemProperty("-", "sun.arch.data.model");
    }

    /**
     * Accessible through the Lookup key {@code runtime}.
     * @return Java Runtime Environment information.
     */
    public String getRuntime() {
        return getSystemProperty("java.runtime.name") + " (build " + getSystemProperty("java.runtime.version")
                + ") from " + getSystemProperty("java.vendor");
    }

    private String getSystemProperty(final String name) {
        return SystemPropertyStringLookup.INSTANCE.lookup(name);
    }

    private String getSystemProperty(final String prefix, final String name) {
        final String value = getSystemProperty(name);
        if (isEmpty(value)) {
            return EMPTY;
        }
        return prefix + value;
    }

    /**
     * Accessible through the Lookup key {@code vm}.
     * @return Java Virtual Machine information.
     */
    public String getVirtualMachine() {
        return getSystemProperty("java.vm.name") + " (build " + getSystemProperty("java.vm.version") + ", "
                + getSystemProperty("java.vm.info") + ")";
    }

    /**
     * Looks up the value of the Java platform key.
     *
     * @param key
     *        the key to be looked up, may be null
     * @return The value of the environment variable.
     */
    @Override
    public String lookup(final String key) {
        switch (key) {
        case "version":
            return "Java version " + getSystemProperty("java.version");
        case "runtime":
            return getRuntime();
        case "vm":
            return getVirtualMachine();
        case "os":
            return getOperatingSystem();
        case "hardware":
            return getHardware();
        case "locale":
            return getLocale();
        default:
            throw new IllegalArgumentException(key);
        }
    }
}
