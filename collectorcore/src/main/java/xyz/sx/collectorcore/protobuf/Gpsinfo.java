// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpsinfo.proto

package xyz.sx.collectorcore.protobuf;

public final class Gpsinfo {
  private Gpsinfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GpsDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:xyz.sx.collectorcore.protobuf.GpsData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     */
    long getTimestamp();

    /**
     * <code>double latitude = 2;</code>
     */
    double getLatitude();

    /**
     * <code>double longitude = 3;</code>
     */
    double getLongitude();

    /**
     * <code>double altitude = 4;</code>
     */
    double getAltitude();

    /**
     * <code>double accuracy = 5;</code>
     */
    double getAccuracy();
  }
  /**
   * Protobuf type {@code xyz.sx.collectorcore.protobuf.GpsData}
   */
  public  static final class GpsData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:xyz.sx.collectorcore.protobuf.GpsData)
      GpsDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GpsData.newBuilder() to construct.
    private GpsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GpsData() {
      timestamp_ = 0L;
      latitude_ = 0D;
      longitude_ = 0D;
      altitude_ = 0D;
      accuracy_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GpsData(
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
            case 8: {

              timestamp_ = input.readInt64();
              break;
            }
            case 17: {

              latitude_ = input.readDouble();
              break;
            }
            case 25: {

              longitude_ = input.readDouble();
              break;
            }
            case 33: {

              altitude_ = input.readDouble();
              break;
            }
            case 41: {

              accuracy_ = input.readDouble();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.sx.collectorcore.protobuf.Gpsinfo.internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.sx.collectorcore.protobuf.Gpsinfo.internal_static_xyz_sx_collectorcore_protobuf_GpsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.class, xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int LATITUDE_FIELD_NUMBER = 2;
    private double latitude_;
    /**
     * <code>double latitude = 2;</code>
     */
    public double getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private double longitude_;
    /**
     * <code>double longitude = 3;</code>
     */
    public double getLongitude() {
      return longitude_;
    }

    public static final int ALTITUDE_FIELD_NUMBER = 4;
    private double altitude_;
    /**
     * <code>double altitude = 4;</code>
     */
    public double getAltitude() {
      return altitude_;
    }

    public static final int ACCURACY_FIELD_NUMBER = 5;
    private double accuracy_;
    /**
     * <code>double accuracy = 5;</code>
     */
    public double getAccuracy() {
      return accuracy_;
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
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      if (latitude_ != 0D) {
        output.writeDouble(2, latitude_);
      }
      if (longitude_ != 0D) {
        output.writeDouble(3, longitude_);
      }
      if (altitude_ != 0D) {
        output.writeDouble(4, altitude_);
      }
      if (accuracy_ != 0D) {
        output.writeDouble(5, accuracy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (latitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, latitude_);
      }
      if (longitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, longitude_);
      }
      if (altitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, altitude_);
      }
      if (accuracy_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, accuracy_);
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
      if (!(obj instanceof xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData)) {
        return super.equals(obj);
      }
      xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData other = (xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData) obj;

      boolean result = true;
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && (
          java.lang.Double.doubleToLongBits(getLatitude())
          == java.lang.Double.doubleToLongBits(
              other.getLatitude()));
      result = result && (
          java.lang.Double.doubleToLongBits(getLongitude())
          == java.lang.Double.doubleToLongBits(
              other.getLongitude()));
      result = result && (
          java.lang.Double.doubleToLongBits(getAltitude())
          == java.lang.Double.doubleToLongBits(
              other.getAltitude()));
      result = result && (
          java.lang.Double.doubleToLongBits(getAccuracy())
          == java.lang.Double.doubleToLongBits(
              other.getAccuracy()));
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLatitude()));
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLongitude()));
      hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAltitude()));
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAccuracy()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parseFrom(
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
    public static Builder newBuilder(xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData prototype) {
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
     * Protobuf type {@code xyz.sx.collectorcore.protobuf.GpsData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:xyz.sx.collectorcore.protobuf.GpsData)
        xyz.sx.collectorcore.protobuf.Gpsinfo.GpsDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return xyz.sx.collectorcore.protobuf.Gpsinfo.internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return xyz.sx.collectorcore.protobuf.Gpsinfo.internal_static_xyz_sx_collectorcore_protobuf_GpsData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.class, xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.Builder.class);
      }

      // Construct using xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        timestamp_ = 0L;

        latitude_ = 0D;

        longitude_ = 0D;

        altitude_ = 0D;

        accuracy_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return xyz.sx.collectorcore.protobuf.Gpsinfo.internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor;
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData getDefaultInstanceForType() {
        return xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.getDefaultInstance();
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData build() {
        xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData buildPartial() {
        xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData result = new xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData(this);
        result.timestamp_ = timestamp_;
        result.latitude_ = latitude_;
        result.longitude_ = longitude_;
        result.altitude_ = altitude_;
        result.accuracy_ = accuracy_;
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
        if (other instanceof xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData) {
          return mergeFrom((xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData other) {
        if (other == xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getLatitude() != 0D) {
          setLatitude(other.getLatitude());
        }
        if (other.getLongitude() != 0D) {
          setLongitude(other.getLongitude());
        }
        if (other.getAltitude() != 0D) {
          setAltitude(other.getAltitude());
        }
        if (other.getAccuracy() != 0D) {
          setAccuracy(other.getAccuracy());
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
        xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private double latitude_ ;
      /**
       * <code>double latitude = 2;</code>
       */
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder setLatitude(double value) {
        
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder clearLatitude() {
        
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>double longitude = 3;</code>
       */
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder setLongitude(double value) {
        
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder clearLongitude() {
        
        longitude_ = 0D;
        onChanged();
        return this;
      }

      private double altitude_ ;
      /**
       * <code>double altitude = 4;</code>
       */
      public double getAltitude() {
        return altitude_;
      }
      /**
       * <code>double altitude = 4;</code>
       */
      public Builder setAltitude(double value) {
        
        altitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double altitude = 4;</code>
       */
      public Builder clearAltitude() {
        
        altitude_ = 0D;
        onChanged();
        return this;
      }

      private double accuracy_ ;
      /**
       * <code>double accuracy = 5;</code>
       */
      public double getAccuracy() {
        return accuracy_;
      }
      /**
       * <code>double accuracy = 5;</code>
       */
      public Builder setAccuracy(double value) {
        
        accuracy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double accuracy = 5;</code>
       */
      public Builder clearAccuracy() {
        
        accuracy_ = 0D;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:xyz.sx.collectorcore.protobuf.GpsData)
    }

    // @@protoc_insertion_point(class_scope:xyz.sx.collectorcore.protobuf.GpsData)
    private static final xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData();
    }

    public static xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GpsData>
        PARSER = new com.google.protobuf.AbstractParser<GpsData>() {
      @java.lang.Override
      public GpsData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GpsData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GpsData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GpsData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public xyz.sx.collectorcore.protobuf.Gpsinfo.GpsData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xyz_sx_collectorcore_protobuf_GpsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgpsinfo.proto\022\035xyz.sx.collectorcore.pr" +
      "otobuf\"e\n\007GpsData\022\021\n\ttimestamp\030\001 \001(\003\022\020\n\010" +
      "latitude\030\002 \001(\001\022\021\n\tlongitude\030\003 \001(\001\022\020\n\010alt" +
      "itude\030\004 \001(\001\022\020\n\010accuracy\030\005 \001(\001b\006proto3"
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
    internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xyz_sx_collectorcore_protobuf_GpsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xyz_sx_collectorcore_protobuf_GpsData_descriptor,
        new java.lang.String[] { "Timestamp", "Latitude", "Longitude", "Altitude", "Accuracy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
