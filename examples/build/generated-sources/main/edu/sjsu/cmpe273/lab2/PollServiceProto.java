// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollService.proto

package edu.sjsu.cmpe273.lab2;

public final class PollServiceProto {
  private PollServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_edu_sjsu_cmpe273_lab2_PollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_edu_sjsu_cmpe273_lab2_PollResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_edu_sjsu_cmpe273_lab2_PollResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021pollService.proto\022\025edu.sjsu.cmpe273.la" +
      "b2\"j\n\013PollRequest\022\023\n\013moderatorId\030\001 \001(\t\022\020" +
      "\n\010question\030\002 \001(\t\022\021\n\tstartedAt\030\003 \001(\t\022\021\n\te" +
      "xpiredAt\030\004 \001(\t\022\016\n\006choice\030\005 \003(\t\"\032\n\014PollRe" +
      "sponse\022\n\n\002id\030\001 \001(\t2f\n\013PollService\022W\n\nCre" +
      "atePoll\022\".edu.sjsu.cmpe273.lab2.PollRequ" +
      "est\032#.edu.sjsu.cmpe273.lab2.PollResponse" +
      "\"\000B+\n\025edu.sjsu.cmpe273.lab2B\020PollService" +
      "ProtoP\001b\006proto3"
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
    internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_edu_sjsu_cmpe273_lab2_PollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor,
        new java.lang.String[] { "ModeratorId", "Question", "StartedAt", "ExpiredAt", "Choice", });
    internal_static_edu_sjsu_cmpe273_lab2_PollResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_edu_sjsu_cmpe273_lab2_PollResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_edu_sjsu_cmpe273_lab2_PollResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
