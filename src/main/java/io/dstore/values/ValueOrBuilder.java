// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/values.proto

package io.dstore.values;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dstore.values.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dstore.values.IntegerValue integer_value = 10;</code>
   */
  io.dstore.values.IntegerValue getIntegerValue();
  /**
   * <code>.dstore.values.IntegerValue integer_value = 10;</code>
   */
  io.dstore.values.IntegerValueOrBuilder getIntegerValueOrBuilder();

  /**
   * <code>.dstore.values.StringValue string_value = 11;</code>
   */
  io.dstore.values.StringValue getStringValue();
  /**
   * <code>.dstore.values.StringValue string_value = 11;</code>
   */
  io.dstore.values.StringValueOrBuilder getStringValueOrBuilder();

  /**
   * <code>.dstore.values.BytesValue byte_value = 12;</code>
   */
  io.dstore.values.BytesValue getByteValue();
  /**
   * <code>.dstore.values.BytesValue byte_value = 12;</code>
   */
  io.dstore.values.BytesValueOrBuilder getByteValueOrBuilder();

  /**
   * <code>.dstore.values.DoubleValue double_value = 13;</code>
   */
  io.dstore.values.DoubleValue getDoubleValue();
  /**
   * <code>.dstore.values.DoubleValue double_value = 13;</code>
   */
  io.dstore.values.DoubleValueOrBuilder getDoubleValueOrBuilder();

  /**
   * <code>.dstore.values.BooleanValue boolean_value = 14;</code>
   */
  io.dstore.values.BooleanValue getBooleanValue();
  /**
   * <code>.dstore.values.BooleanValue boolean_value = 14;</code>
   */
  io.dstore.values.BooleanValueOrBuilder getBooleanValueOrBuilder();

  /**
   * <code>.dstore.values.DecimalValue decimal_value = 15;</code>
   */
  io.dstore.values.DecimalValue getDecimalValue();
  /**
   * <code>.dstore.values.DecimalValue decimal_value = 15;</code>
   */
  io.dstore.values.DecimalValueOrBuilder getDecimalValueOrBuilder();

  /**
   * <code>.dstore.values.TimestampValue timestamp_value = 16;</code>
   */
  io.dstore.values.TimestampValue getTimestampValue();
  /**
   * <code>.dstore.values.TimestampValue timestamp_value = 16;</code>
   */
  io.dstore.values.TimestampValueOrBuilder getTimestampValueOrBuilder();

  /**
   * <code>.dstore.values.LongValue long_value = 17;</code>
   */
  io.dstore.values.LongValue getLongValue();
  /**
   * <code>.dstore.values.LongValue long_value = 17;</code>
   */
  io.dstore.values.LongValueOrBuilder getLongValueOrBuilder();

  public io.dstore.values.Value.ValueCase getValueCase();
}
