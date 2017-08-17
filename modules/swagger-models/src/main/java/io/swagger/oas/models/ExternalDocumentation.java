/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.models;

import java.util.Objects;

/**
 * ExternalDocumentation
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc2/versions/3.0.md#externalDocumentationObject"
 */


public class ExternalDocumentation {
  private String description = null;
  private String url = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the description property from a ExternalDocumentation instance.
   *
   * @return String description
   **/

  public String getDescription() {
    return description;
  }

  /**
   * sets this ExternalDocumentation's description property to the given description.
   *
   * @param String description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * sets this ExternalDocumentation's description property to the given description and
   * returns this instance of ExternalDocumentation.
   *
   * @param String description
   * @return ExternalDocumentation
   */
  public ExternalDocumentation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * returns the url property from a ExternalDocumentation instance.
   *
   * @return String url
   **/

  public String getUrl() {
    return url;
  }

  /**
   * sets this ExternalDocumentation's url property to the given url.
   *
   * @param String url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * sets this ExternalDocumentation's url property to the given url and
   * returns this instance of ExternalDocumentation.
   *
   * @param String url
   * @return ExternalDocumentation
   */
  public ExternalDocumentation url(String url) {
    this.url = url;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDocumentation externalDocumentation = (ExternalDocumentation) o;
    return Objects.equals(this.description, externalDocumentation.description) &&
        Objects.equals(this.url, externalDocumentation.url) &&
        Objects.equals(this.extensions, externalDocumentation.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, url, extensions);
  }

  /**
   * returns the extensions property from a ExternalDocumentation instance.
   *
   * @return Map&lt;String, Object&gt;extensions
   **/
  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  /**
   * Adds the given extension to this ExternalDocumentation's map of extensions, with the given key as its key.
   *
   * @param String key
   * @param Object value
   * @return Components
   */
  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  /**
   * sets this ExternalDocumentation's extensions property to the given extensions.
   *
   * @param Map&lt;String, Object&gt;extensions
   */
  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDocumentation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

