/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface CreateGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project in which to create the group. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The project in which to create the group. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The group.
   */
  com.google.monitoring.v3.Group getGroup();
  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, validate this request but do not create the group.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
