/*
* IBM Confidential
*
* OCO Source Materials
*
* Copyright IBM Corp. 2017
*
* The source code for this program is not published or otherwise divested
* of its trade secrets, irrespective of what has been deposited with the
* U.S. Copyright Office.
*/
package io.swagger.oas.annotations.media;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 * Single encoding definition to be applied to single Schema Object
 **/

@Target({})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface EncodingObject {

    /**
     * The name of this encoding object instance.
     * This property is a key in encoding map of MediaType object and
     * MUST exist in a schema as a property.
     **/

    String name() default "";

    /**
     * The Content-Type for encoding a specific property.
     **/

    String contentType() default "";

    /**
     * Describes how a specific property value will be serialized depending on its type
     **/

    String style() default "";

    /**
     *
     * When this is true, property values of type array or object generate separate parameters for each value of the array,
     * or key-value-pair of the map.
     *
     **/

    boolean explode() default false;

    /**
     *
     * Determines whether the parameter value SHOULD allow reserved characters,
     * as defined by RFC3986 :/?#[]@!$&'()*+,;= to be included without percent-encoding.
     *
     **/

    boolean allowReserved() default false;

    /**
     * TODO: headers implementation
     *
     */

}
