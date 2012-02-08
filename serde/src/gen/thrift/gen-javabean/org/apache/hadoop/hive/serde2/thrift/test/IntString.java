/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.serde2.thrift.test;

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

public class IntString implements org.apache.thrift.TBase<IntString, IntString._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IntString");

  private static final org.apache.thrift.protocol.TField MYINT_FIELD_DESC = new org.apache.thrift.protocol.TField("myint", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("myString", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UNDERSCORE_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("underscore_int", org.apache.thrift.protocol.TType.I32, (short)3);

  private int myint;
  private String myString;
  private int underscore_int;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MYINT((short)1, "myint"),
    MY_STRING((short)2, "myString"),
    UNDERSCORE_INT((short)3, "underscore_int");

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
        case 1: // MYINT
          return MYINT;
        case 2: // MY_STRING
          return MY_STRING;
        case 3: // UNDERSCORE_INT
          return UNDERSCORE_INT;
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
  private static final int __MYINT_ISSET_ID = 0;
  private static final int __UNDERSCORE_INT_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MYINT, new org.apache.thrift.meta_data.FieldMetaData("myint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MY_STRING, new org.apache.thrift.meta_data.FieldMetaData("myString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNDERSCORE_INT, new org.apache.thrift.meta_data.FieldMetaData("underscore_int", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IntString.class, metaDataMap);
  }

  public IntString() {
  }

  public IntString(
    int myint,
    String myString,
    int underscore_int)
  {
    this();
    this.myint = myint;
    setMyintIsSet(true);
    this.myString = myString;
    this.underscore_int = underscore_int;
    setUnderscore_intIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IntString(IntString other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.myint = other.myint;
    if (other.isSetMyString()) {
      this.myString = other.myString;
    }
    this.underscore_int = other.underscore_int;
  }

  public IntString deepCopy() {
    return new IntString(this);
  }

  @Override
  public void clear() {
    setMyintIsSet(false);
    this.myint = 0;
    this.myString = null;
    setUnderscore_intIsSet(false);
    this.underscore_int = 0;
  }

  public int getMyint() {
    return this.myint;
  }

  public void setMyint(int myint) {
    this.myint = myint;
    setMyintIsSet(true);
  }

  public void unsetMyint() {
    __isset_bit_vector.clear(__MYINT_ISSET_ID);
  }

  /** Returns true if field myint is set (has been assigned a value) and false otherwise */
  public boolean isSetMyint() {
    return __isset_bit_vector.get(__MYINT_ISSET_ID);
  }

  public void setMyintIsSet(boolean value) {
    __isset_bit_vector.set(__MYINT_ISSET_ID, value);
  }

  public String getMyString() {
    return this.myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public void unsetMyString() {
    this.myString = null;
  }

  /** Returns true if field myString is set (has been assigned a value) and false otherwise */
  public boolean isSetMyString() {
    return this.myString != null;
  }

  public void setMyStringIsSet(boolean value) {
    if (!value) {
      this.myString = null;
    }
  }

  public int getUnderscore_int() {
    return this.underscore_int;
  }

  public void setUnderscore_int(int underscore_int) {
    this.underscore_int = underscore_int;
    setUnderscore_intIsSet(true);
  }

  public void unsetUnderscore_int() {
    __isset_bit_vector.clear(__UNDERSCORE_INT_ISSET_ID);
  }

  /** Returns true if field underscore_int is set (has been assigned a value) and false otherwise */
  public boolean isSetUnderscore_int() {
    return __isset_bit_vector.get(__UNDERSCORE_INT_ISSET_ID);
  }

  public void setUnderscore_intIsSet(boolean value) {
    __isset_bit_vector.set(__UNDERSCORE_INT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MYINT:
      if (value == null) {
        unsetMyint();
      } else {
        setMyint((Integer)value);
      }
      break;

    case MY_STRING:
      if (value == null) {
        unsetMyString();
      } else {
        setMyString((String)value);
      }
      break;

    case UNDERSCORE_INT:
      if (value == null) {
        unsetUnderscore_int();
      } else {
        setUnderscore_int((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MYINT:
      return new Integer(getMyint());

    case MY_STRING:
      return getMyString();

    case UNDERSCORE_INT:
      return new Integer(getUnderscore_int());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MYINT:
      return isSetMyint();
    case MY_STRING:
      return isSetMyString();
    case UNDERSCORE_INT:
      return isSetUnderscore_int();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IntString)
      return this.equals((IntString)that);
    return false;
  }

  public boolean equals(IntString that) {
    if (that == null)
      return false;

    boolean this_present_myint = true;
    boolean that_present_myint = true;
    if (this_present_myint || that_present_myint) {
      if (!(this_present_myint && that_present_myint))
        return false;
      if (this.myint != that.myint)
        return false;
    }

    boolean this_present_myString = true && this.isSetMyString();
    boolean that_present_myString = true && that.isSetMyString();
    if (this_present_myString || that_present_myString) {
      if (!(this_present_myString && that_present_myString))
        return false;
      if (!this.myString.equals(that.myString))
        return false;
    }

    boolean this_present_underscore_int = true;
    boolean that_present_underscore_int = true;
    if (this_present_underscore_int || that_present_underscore_int) {
      if (!(this_present_underscore_int && that_present_underscore_int))
        return false;
      if (this.underscore_int != that.underscore_int)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(IntString other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    IntString typedOther = (IntString)other;

    lastComparison = Boolean.valueOf(isSetMyint()).compareTo(typedOther.isSetMyint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMyint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.myint, typedOther.myint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMyString()).compareTo(typedOther.isSetMyString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMyString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.myString, typedOther.myString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnderscore_int()).compareTo(typedOther.isSetUnderscore_int());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnderscore_int()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.underscore_int, typedOther.underscore_int);
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
        case 1: // MYINT
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.myint = iprot.readI32();
            setMyintIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // MY_STRING
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.myString = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // UNDERSCORE_INT
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.underscore_int = iprot.readI32();
            setUnderscore_intIsSet(true);
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
    oprot.writeFieldBegin(MYINT_FIELD_DESC);
    oprot.writeI32(this.myint);
    oprot.writeFieldEnd();
    if (this.myString != null) {
      oprot.writeFieldBegin(MY_STRING_FIELD_DESC);
      oprot.writeString(this.myString);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(UNDERSCORE_INT_FIELD_DESC);
    oprot.writeI32(this.underscore_int);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IntString(");
    boolean first = true;

    sb.append("myint:");
    sb.append(this.myint);
    first = false;
    if (!first) sb.append(", ");
    sb.append("myString:");
    if (this.myString == null) {
      sb.append("null");
    } else {
      sb.append(this.myString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("underscore_int:");
    sb.append(this.underscore_int);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

}

