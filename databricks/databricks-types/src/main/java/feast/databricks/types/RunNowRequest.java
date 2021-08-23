/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright 2018-2020 The Feast Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package feast.databricks.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Optional;

@AutoValue
@JsonDeserialize(builder = AutoValue_RunNowRequest.Builder.class)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public abstract class RunNowRequest {

  @JsonProperty("job_id")
  public abstract long getJobId();

  @JsonProperty("jar_params")
  public abstract Optional<List<String>> getJarParams();

  public static Builder builder() {
    return new AutoValue_RunNowRequest.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    @JsonProperty("job_id")
    public abstract Builder setJobId(long value);

    @JsonProperty("jar_params")
    public abstract Builder setJarParams(List<String> value);

    public abstract RunNowRequest build();
  }
}