/*
 * Copyright (c) 2011, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.graphio;

/**
 * Special support for dealing with enums.Normally one can represent various {@link GraphOutput
 * graph} enum values with real {@link Enum} instances. In case this is not possible, the
 * {@link GraphOutput.Builder} allows one to register implementation of this interface to treat them
 * especially.
 *
 * @param <C> the type that represents the classes in the graph
 */
public interface GraphEnums<C> {
    /**
     * Recognizes an
     * <q>enum</q> object. If this object represents an enum, then an object that represents its
     * class shall be returned.
     *
     * @param enumValue the value to test
     * @return <code>null</code> if the value isn't enum, otherwise its class
     */
    C findEnumClass(Object enumValue);

    /**
     * Ordinal of an enum. If the <code>obj</code> represents an enum, then return its ordinal
     * number otherwise return <code>-1</code>
     *
     * @param obj the value to test
     * @return <code>-1</code> if the obj isn't enum, otherwise its ordinal number
     */
    int findEnumOrdinal(Object obj);

    /**
     * All possible values of an enum. If the provided clazz object represents an enum, then compute
     * enum value names in ordinal order and return them as a string array. Otherwise return
     * <code>null</code>
     * 
     * @param clazz the class to test
     * @return <code>null</code> if the clazz isn't an enum, otherwise names of its values
     */
    String[] findEnumTypeValues(C clazz);

}
