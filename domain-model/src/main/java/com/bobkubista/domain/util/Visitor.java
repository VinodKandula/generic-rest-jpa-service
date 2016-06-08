/**
 * Bob Kubista's examples
 */
package com.bobkubista.domain.util;

/**
 * Visitor interface.
 *
 * @author Bob
 *
 */
@FunctionalInterface
public interface Visitor {

    /**
     * Do an operation with the provided {@link Visitable} object
     *
     * @param element
     *            the {@link Visitable} object to visit. This will do the
     *            visitor operations on the element
     */
    public void accept(final Visitable element);
}
