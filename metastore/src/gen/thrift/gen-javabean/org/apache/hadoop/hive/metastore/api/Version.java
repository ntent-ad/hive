/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Version implements org.apache.thrift.TBase<Version, Version._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Version");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COMMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("comments", org.apache.thrift.protocol.TType.STRING, (short)2);

  private String version;
  private String comments;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    COMMENTS((short)2, "comments");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION
          return VERSION;
        case 2: // COMMENTS
          return COMMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMMENTS, new org.apache.thrift.meta_data.FieldMetaData("comments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Version.class, metaDataMap);
  }

  public Version() {
  }

  public Version(
    String version,
    String comments)
  {
    this();
    this.version = version;
    this.comments = comments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Version(Version other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetComments()) {
      this.comments = other.comments;
    }
  }

  public Version deepCopy() {
    return new Version(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.comments = null;
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public void unsetComments() {
    this.comments = null;
  }

  /** Returns true if field comments is set (has been assigned a value) and false otherwise */
  public boolean isSetComments() {
    return this.comments != null;
  }

  public void setCommentsIsSet(boolean value) {
    if (!value) {
      this.comments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((String)value);
      }
      break;

    case COMMENTS:
      if (value == null) {
        unsetComments();
      } else {
        setComments((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case COMMENTS:
      return getComments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case COMMENTS:
      return isSetComments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Version)
      return this.equals((Version)that);
    return false;
  }

  public boolean equals(Version that) {
    if (that == null)
      return false;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_comments = true && this.isSetComments();
    boolean that_present_comments = true && that.isSetComments();
    if (this_present_comments || that_present_comments) {
      if (!(this_present_comments && that_present_comments))
        return false;
      if (!this.comments.equals(that.comments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Version other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Version typedOther = (Version)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComments()).compareTo(typedOther.isSetComments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comments, typedOther.comments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // VERSION
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.version = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COMMENTS
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.comments = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.version != null) {
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeString(this.version);
      oprot.writeFieldEnd();
    }
    if (this.comments != null) {
      oprot.writeFieldBegin(COMMENTS_FIELD_DESC);
      oprot.writeString(this.comments);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Version(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comments:");
    if (this.comments == null) {
      sb.append("null");
    } else {
      sb.append(this.comments);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

}

