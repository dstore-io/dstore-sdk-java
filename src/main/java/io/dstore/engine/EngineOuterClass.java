// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/engine/engine.proto

package io.dstore.engine;

public final class EngineOuterClass {
  private EngineOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_engine_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_engine_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_engine_MetaInformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_engine_MetaInformation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032dstore/engine/engine.proto\022\rdstore.eng" +
      "ine\":\n\007Message\022\020\n\010severity\030\001 \001(\005\022\014\n\004code" +
      "\030\002 \001(\005\022\017\n\007message\030\003 \001(\t\"\237\001\n\017MetaInformat" +
      "ion\0222\n\004type\030\001 \001(\0162$.dstore.engine.MetaIn" +
      "formation.Types\022\023\n\013information\030\002 \001(\t\022\017\n\007" +
      "details\030\003 \001(\t\"2\n\005Types\022\n\n\006UNKOWN\020\000\022\016\n\nSQ" +
      "L_STRING\020\001\022\r\n\tEXEC_TIME\020\002B>\n\020io.dstore.e" +
      "ngineB\020EngineOuterClassP\001Z\026gosdk.dstore." +
      "de/engineb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_dstore_engine_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dstore_engine_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_engine_Message_descriptor,
        new java.lang.String[] { "Severity", "Code", "Message", });
    internal_static_dstore_engine_MetaInformation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dstore_engine_MetaInformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_engine_MetaInformation_descriptor,
        new java.lang.String[] { "Type", "Information", "Details", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
