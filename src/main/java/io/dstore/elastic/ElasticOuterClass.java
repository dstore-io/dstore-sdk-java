// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/elastic/elastic.proto

package io.dstore.elastic;

public final class ElasticOuterClass {
  private ElasticOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034dstore/elastic/elastic.proto\022\016dstore.e" +
      "lastic\032&dstore/elastic/facetednavigation" +
      ".proto2|\n\007Elastic\022q\n\021facetedNavigation\022," +
      ".dstore.elastic.facetednavigation.Parame" +
      "ters\032*.dstore.elastic.facetednavigation." +
      "Response\"\0000\001B\023\n\021io.dstore.elasticb\006proto" +
      "3"
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
          io.dstore.elastic.FacetedNavigation.getDescriptor(),
        }, assigner);
    io.dstore.elastic.FacetedNavigation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
