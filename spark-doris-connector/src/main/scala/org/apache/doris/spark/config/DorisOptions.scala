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

object DorisOptions {

  private[this] def key[T](key: String): ConfigOptionBuilder[T] =
    new ConfigOptionBuilder[T](key, null.asInstanceOf[T], null)

  val DORIS_FENODES = key[String]("doris.fenodes")
    .defaultValue(null)
    .description("")

  val DORIS_READ_FIELD = key[String]("doris.read.field")
    .defaultValue(null)
    .description("")

  val DORIS_EXEC_MEM_LIMIT = key[Long]("doris.exec.mem.limit")
    .defaultValue(2147483648L)
    .description("")

  val DORIS_BATCH_SIZE = key[Integer]("doris.batch.size")
    .defaultValue(1024)
    .description("")


}
