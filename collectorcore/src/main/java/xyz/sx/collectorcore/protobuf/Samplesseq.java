// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: samplesseq.proto

package xyz.sx.collectorcore.protobuf;

public final class Samplesseq {
  private Samplesseq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SamplesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:xyz.sx.collectorcore.protobuf.Samples)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string desc = 1;</code>
     */
    java.lang.String getDesc();
    /**
     * <code>string desc = 1;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();

    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> 
        getDataList();
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection getData(int index);
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    int getDataCount();
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    java.util.List<? extends xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder> 
        getDataOrBuilderList();
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder getDataOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code xyz.sx.collectorcore.protobuf.Samples}
   */
  public  static final class Samples extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:xyz.sx.collectorcore.protobuf.Samples)
      SamplesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Samples.newBuilder() to construct.
    private Samples(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Samples() {
      desc_ = "";
      data_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Samples(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              desc_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                data_ = new java.util.ArrayList<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection>();
                mutable_bitField0_ |= 0x00000002;
              }
              data_.add(
                  input.readMessage(xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.sx.collectorcore.protobuf.Samplesseq.internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.sx.collectorcore.protobuf.Samplesseq.internal_static_xyz_sx_collectorcore_protobuf_Samples_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.sx.collectorcore.protobuf.Samplesseq.Samples.class, xyz.sx.collectorcore.protobuf.Samplesseq.Samples.Builder.class);
    }

    private int bitField0_;
    public static final int DESC_FIELD_NUMBER = 1;
    private volatile java.lang.Object desc_;
    /**
     * <code>string desc = 1;</code>
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      }
    }
    /**
     * <code>string desc = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> data_;
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    public java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> getDataList() {
      return data_;
    }
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    public java.util.List<? extends xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder> 
        getDataOrBuilderList() {
      return data_;
    }
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection getData(int index) {
      return data_.get(index);
    }
    /**
     * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
     */
    public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder getDataOrBuilder(
        int index) {
      return data_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getDescBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, desc_);
      }
      for (int i = 0; i < data_.size(); i++) {
        output.writeMessage(2, data_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDescBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, desc_);
      }
      for (int i = 0; i < data_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, data_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof xyz.sx.collectorcore.protobuf.Samplesseq.Samples)) {
        return super.equals(obj);
      }
      xyz.sx.collectorcore.protobuf.Samplesseq.Samples other = (xyz.sx.collectorcore.protobuf.Samplesseq.Samples) obj;

      boolean result = true;
      result = result && getDesc()
          .equals(other.getDesc());
      result = result && getDataList()
          .equals(other.getDataList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc().hashCode();
      if (getDataCount() > 0) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(xyz.sx.collectorcore.protobuf.Samplesseq.Samples prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code xyz.sx.collectorcore.protobuf.Samples}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:xyz.sx.collectorcore.protobuf.Samples)
        xyz.sx.collectorcore.protobuf.Samplesseq.SamplesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return xyz.sx.collectorcore.protobuf.Samplesseq.internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return xyz.sx.collectorcore.protobuf.Samplesseq.internal_static_xyz_sx_collectorcore_protobuf_Samples_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                xyz.sx.collectorcore.protobuf.Samplesseq.Samples.class, xyz.sx.collectorcore.protobuf.Samplesseq.Samples.Builder.class);
      }

      // Construct using xyz.sx.collectorcore.protobuf.Samplesseq.Samples.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        desc_ = "";

        if (dataBuilder_ == null) {
          data_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          dataBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return xyz.sx.collectorcore.protobuf.Samplesseq.internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor;
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Samplesseq.Samples getDefaultInstanceForType() {
        return xyz.sx.collectorcore.protobuf.Samplesseq.Samples.getDefaultInstance();
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Samplesseq.Samples build() {
        xyz.sx.collectorcore.protobuf.Samplesseq.Samples result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Samplesseq.Samples buildPartial() {
        xyz.sx.collectorcore.protobuf.Samplesseq.Samples result = new xyz.sx.collectorcore.protobuf.Samplesseq.Samples(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.desc_ = desc_;
        if (dataBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            data_ = java.util.Collections.unmodifiableList(data_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof xyz.sx.collectorcore.protobuf.Samplesseq.Samples) {
          return mergeFrom((xyz.sx.collectorcore.protobuf.Samplesseq.Samples)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(xyz.sx.collectorcore.protobuf.Samplesseq.Samples other) {
        if (other == xyz.sx.collectorcore.protobuf.Samplesseq.Samples.getDefaultInstance()) return this;
        if (!other.getDesc().isEmpty()) {
          desc_ = other.desc_;
          onChanged();
        }
        if (dataBuilder_ == null) {
          if (!other.data_.isEmpty()) {
            if (data_.isEmpty()) {
              data_ = other.data_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDataIsMutable();
              data_.addAll(other.data_);
            }
            onChanged();
          }
        } else {
          if (!other.data_.isEmpty()) {
            if (dataBuilder_.isEmpty()) {
              dataBuilder_.dispose();
              dataBuilder_ = null;
              data_ = other.data_;
              bitField0_ = (bitField0_ & ~0x00000002);
              dataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDataFieldBuilder() : null;
            } else {
              dataBuilder_.addAllMessages(other.data_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        xyz.sx.collectorcore.protobuf.Samplesseq.Samples parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (xyz.sx.collectorcore.protobuf.Samplesseq.Samples) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object desc_ = "";
      /**
       * <code>string desc = 1;</code>
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string desc = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string desc = 1;</code>
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 1;</code>
       */
      public Builder clearDesc() {
        
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 1;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        desc_ = value;
        onChanged();
        return this;
      }

      private java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> data_ =
        java.util.Collections.emptyList();
      private void ensureDataIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = new java.util.ArrayList<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection>(data_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder> dataBuilder_;

      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> getDataList() {
        if (dataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(data_);
        } else {
          return dataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public int getDataCount() {
        if (dataBuilder_ == null) {
          return data_.size();
        } else {
          return dataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection getData(int index) {
        if (dataBuilder_ == null) {
          return data_.get(index);
        } else {
          return dataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder setData(
          int index, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.set(index, value);
          onChanged();
        } else {
          dataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder setData(
          int index, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.set(index, builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder addData(xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.add(value);
          onChanged();
        } else {
          dataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder addData(
          int index, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.add(index, value);
          onChanged();
        } else {
          dataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder addData(
          xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.add(builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder addData(
          int index, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.add(index, builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder addAllData(
          java.lang.Iterable<? extends xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection> values) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, data_);
          onChanged();
        } else {
          dataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          dataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public Builder removeData(int index) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.remove(index);
          onChanged();
        } else {
          dataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder getDataBuilder(
          int index) {
        return getDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder getDataOrBuilder(
          int index) {
        if (dataBuilder_ == null) {
          return data_.get(index);  } else {
          return dataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public java.util.List<? extends xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder> 
           getDataOrBuilderList() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(data_);
        }
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder addDataBuilder() {
        return getDataFieldBuilder().addBuilder(
            xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.getDefaultInstance());
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder addDataBuilder(
          int index) {
        return getDataFieldBuilder().addBuilder(
            index, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.getDefaultInstance());
      }
      /**
       * <code>repeated .xyz.sx.collectorcore.protobuf.SensorCollection data = 2;</code>
       */
      public java.util.List<xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder> 
           getDataBuilderList() {
        return getDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollection.Builder, xyz.sx.collectorcore.protobuf.Sensorcollection.SensorCollectionOrBuilder>(
                  data_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:xyz.sx.collectorcore.protobuf.Samples)
    }

    // @@protoc_insertion_point(class_scope:xyz.sx.collectorcore.protobuf.Samples)
    private static final xyz.sx.collectorcore.protobuf.Samplesseq.Samples DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new xyz.sx.collectorcore.protobuf.Samplesseq.Samples();
    }

    public static xyz.sx.collectorcore.protobuf.Samplesseq.Samples getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Samples>
        PARSER = new com.google.protobuf.AbstractParser<Samples>() {
      @java.lang.Override
      public Samples parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Samples(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Samples> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Samples> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public xyz.sx.collectorcore.protobuf.Samplesseq.Samples getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_sx_collectorcore_protobuf_Samples_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020samplesseq.proto\022\035xyz.sx.collectorcore" +
      ".protobuf\032\026sensorcollection.proto\"V\n\007Sam" +
      "ples\022\014\n\004desc\030\001 \001(\t\022=\n\004data\030\002 \003(\0132/.xyz.s" +
      "x.collectorcore.protobuf.SensorCollectio" +
      "nb\006proto3"
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
          xyz.sx.collectorcore.protobuf.Sensorcollection.getDescriptor(),
        }, assigner);
    internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xyz_sx_collectorcore_protobuf_Samples_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_sx_collectorcore_protobuf_Samples_descriptor,
        new java.lang.String[] { "Desc", "Data", });
    xyz.sx.collectorcore.protobuf.Sensorcollection.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
