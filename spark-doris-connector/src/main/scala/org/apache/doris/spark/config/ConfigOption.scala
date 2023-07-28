// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.doris.spark.config

class ConfigOption[T](val key: String, val defaultValue: T, val description: String)

private[config] class ConfigOptionBuilder[T](private[this] var key: String,
                       private[this] var defaultValue: T,
                       private[this] var description: String) {
  def key(key: String): ConfigOptionBuilder[T] = {
    this.key = key
    this
  }

  def defaultValue(defaultValue: T): ConfigOptionBuilder[T] = {
    this.defaultValue = defaultValue
    this
  }

  def description(description: String): ConfigOption[T] = {
    this.description = description
    new ConfigOption[T](key, defaultValue, description)
  }

}
