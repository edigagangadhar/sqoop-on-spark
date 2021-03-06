/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.model;

import org.apache.sqoop.classification.InterfaceAudience;
import org.apache.sqoop.classification.InterfaceStability;

import java.util.List;

/**
 * Config describing all required information for the driver
 * NOTE: It extends a config list since {@link MToConfig} could consist of a related config groups
 *       In future this could be simplified to hold a single list of all configs for the driver
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class MDriverConfig extends MConfigList {
  public MDriverConfig(List<MConfig> configs) {
    super(configs, MConfigType.JOB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Driver:");
    sb.append(super.toString());
    return sb.toString();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }

    if (!(other instanceof MDriverConfig)) {
      return false;
    }

    MDriverConfig mDriver = (MDriverConfig) other;
    return super.equals(mDriver);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public MDriverConfig clone(boolean cloneWithValue) {
    MDriverConfig copy = new MDriverConfig(super.clone(cloneWithValue).getConfigs());
    return copy;
  }
}