/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cassianetworks.hub.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-10")
public class Characteristic implements org.apache.thrift.TBase<Characteristic, Characteristic._Fields>, java.io.Serializable, Cloneable, Comparable<Characteristic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Characteristic");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WRITE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("writeType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("property", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField PERMISSION_FIELD_DESC = new org.apache.thrift.protocol.TField("permission", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("handle", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField VALUE_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("valueHandle", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("descriptors", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CharacteristicStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CharacteristicTupleSchemeFactory());
  }

  public String uuid; // required
  public String desc; // required
  public int writeType; // required
  public int property; // required
  public int permission; // required
  public int handle; // required
  public int valueHandle; // required
  public List<Descriptor> descriptors; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UUID((short)1, "uuid"),
    DESC((short)2, "desc"),
    WRITE_TYPE((short)3, "writeType"),
    PROPERTY((short)4, "property"),
    PERMISSION((short)5, "permission"),
    HANDLE((short)6, "handle"),
    VALUE_HANDLE((short)7, "valueHandle"),
    DESCRIPTORS((short)8, "descriptors");

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
        case 1: // UUID
          return UUID;
        case 2: // DESC
          return DESC;
        case 3: // WRITE_TYPE
          return WRITE_TYPE;
        case 4: // PROPERTY
          return PROPERTY;
        case 5: // PERMISSION
          return PERMISSION;
        case 6: // HANDLE
          return HANDLE;
        case 7: // VALUE_HANDLE
          return VALUE_HANDLE;
        case 8: // DESCRIPTORS
          return DESCRIPTORS;
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
  private static final int __WRITETYPE_ISSET_ID = 0;
  private static final int __PROPERTY_ISSET_ID = 1;
  private static final int __PERMISSION_ISSET_ID = 2;
  private static final int __HANDLE_ISSET_ID = 3;
  private static final int __VALUEHANDLE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("writeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("property", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PERMISSION, new org.apache.thrift.meta_data.FieldMetaData("permission", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HANDLE, new org.apache.thrift.meta_data.FieldMetaData("handle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALUE_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("valueHandle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("descriptors", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Descriptor"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Characteristic.class, metaDataMap);
  }

  public Characteristic() {
  }

  public Characteristic(
    String uuid,
    String desc,
    int writeType,
    int property,
    int permission,
    int handle,
    int valueHandle,
    List<Descriptor> descriptors)
  {
    this();
    this.uuid = uuid;
    this.desc = desc;
    this.writeType = writeType;
    setWriteTypeIsSet(true);
    this.property = property;
    setPropertyIsSet(true);
    this.permission = permission;
    setPermissionIsSet(true);
    this.handle = handle;
    setHandleIsSet(true);
    this.valueHandle = valueHandle;
    setValueHandleIsSet(true);
    this.descriptors = descriptors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Characteristic(Characteristic other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUuid()) {
      this.uuid = other.uuid;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
    this.writeType = other.writeType;
    this.property = other.property;
    this.permission = other.permission;
    this.handle = other.handle;
    this.valueHandle = other.valueHandle;
    if (other.isSetDescriptors()) {
      List<Descriptor> __this__descriptors = new ArrayList<Descriptor>(other.descriptors.size());
      for (Descriptor other_element : other.descriptors) {
        __this__descriptors.add(other_element);
      }
      this.descriptors = __this__descriptors;
    }
  }

  public Characteristic deepCopy() {
    return new Characteristic(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.desc = null;
    setWriteTypeIsSet(false);
    this.writeType = 0;
    setPropertyIsSet(false);
    this.property = 0;
    setPermissionIsSet(false);
    this.permission = 0;
    setHandleIsSet(false);
    this.handle = 0;
    setValueHandleIsSet(false);
    this.valueHandle = 0;
    this.descriptors = null;
  }

  public String getUuid() {
    return this.uuid;
  }

  public Characteristic setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public void unsetUuid() {
    this.uuid = null;
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return this.uuid != null;
  }

  public void setUuidIsSet(boolean value) {
    if (!value) {
      this.uuid = null;
    }
  }

  public String getDesc() {
    return this.desc;
  }

  public Characteristic setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public int getWriteType() {
    return this.writeType;
  }

  public Characteristic setWriteType(int writeType) {
    this.writeType = writeType;
    setWriteTypeIsSet(true);
    return this;
  }

  public void unsetWriteType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITETYPE_ISSET_ID);
  }

  /** Returns true if field writeType is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteType() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITETYPE_ISSET_ID);
  }

  public void setWriteTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITETYPE_ISSET_ID, value);
  }

  public int getProperty() {
    return this.property;
  }

  public Characteristic setProperty(int property) {
    this.property = property;
    setPropertyIsSet(true);
    return this;
  }

  public void unsetProperty() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPERTY_ISSET_ID);
  }

  /** Returns true if field property is set (has been assigned a value) and false otherwise */
  public boolean isSetProperty() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPERTY_ISSET_ID);
  }

  public void setPropertyIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPERTY_ISSET_ID, value);
  }

  public int getPermission() {
    return this.permission;
  }

  public Characteristic setPermission(int permission) {
    this.permission = permission;
    setPermissionIsSet(true);
    return this;
  }

  public void unsetPermission() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERMISSION_ISSET_ID);
  }

  /** Returns true if field permission is set (has been assigned a value) and false otherwise */
  public boolean isSetPermission() {
    return EncodingUtils.testBit(__isset_bitfield, __PERMISSION_ISSET_ID);
  }

  public void setPermissionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERMISSION_ISSET_ID, value);
  }

  public int getHandle() {
    return this.handle;
  }

  public Characteristic setHandle(int handle) {
    this.handle = handle;
    setHandleIsSet(true);
    return this;
  }

  public void unsetHandle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HANDLE_ISSET_ID);
  }

  /** Returns true if field handle is set (has been assigned a value) and false otherwise */
  public boolean isSetHandle() {
    return EncodingUtils.testBit(__isset_bitfield, __HANDLE_ISSET_ID);
  }

  public void setHandleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HANDLE_ISSET_ID, value);
  }

  public int getValueHandle() {
    return this.valueHandle;
  }

  public Characteristic setValueHandle(int valueHandle) {
    this.valueHandle = valueHandle;
    setValueHandleIsSet(true);
    return this;
  }

  public void unsetValueHandle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALUEHANDLE_ISSET_ID);
  }

  /** Returns true if field valueHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetValueHandle() {
    return EncodingUtils.testBit(__isset_bitfield, __VALUEHANDLE_ISSET_ID);
  }

  public void setValueHandleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALUEHANDLE_ISSET_ID, value);
  }

  public int getDescriptorsSize() {
    return (this.descriptors == null) ? 0 : this.descriptors.size();
  }

  public java.util.Iterator<Descriptor> getDescriptorsIterator() {
    return (this.descriptors == null) ? null : this.descriptors.iterator();
  }

  public void addToDescriptors(Descriptor elem) {
    if (this.descriptors == null) {
      this.descriptors = new ArrayList<Descriptor>();
    }
    this.descriptors.add(elem);
  }

  public List<Descriptor> getDescriptors() {
    return this.descriptors;
  }

  public Characteristic setDescriptors(List<Descriptor> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public void unsetDescriptors() {
    this.descriptors = null;
  }

  /** Returns true if field descriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetDescriptors() {
    return this.descriptors != null;
  }

  public void setDescriptorsIsSet(boolean value) {
    if (!value) {
      this.descriptors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((String)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((String)value);
      }
      break;

    case WRITE_TYPE:
      if (value == null) {
        unsetWriteType();
      } else {
        setWriteType((Integer)value);
      }
      break;

    case PROPERTY:
      if (value == null) {
        unsetProperty();
      } else {
        setProperty((Integer)value);
      }
      break;

    case PERMISSION:
      if (value == null) {
        unsetPermission();
      } else {
        setPermission((Integer)value);
      }
      break;

    case HANDLE:
      if (value == null) {
        unsetHandle();
      } else {
        setHandle((Integer)value);
      }
      break;

    case VALUE_HANDLE:
      if (value == null) {
        unsetValueHandle();
      } else {
        setValueHandle((Integer)value);
      }
      break;

    case DESCRIPTORS:
      if (value == null) {
        unsetDescriptors();
      } else {
        setDescriptors((List<Descriptor>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case DESC:
      return getDesc();

    case WRITE_TYPE:
      return getWriteType();

    case PROPERTY:
      return getProperty();

    case PERMISSION:
      return getPermission();

    case HANDLE:
      return getHandle();

    case VALUE_HANDLE:
      return getValueHandle();

    case DESCRIPTORS:
      return getDescriptors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case DESC:
      return isSetDesc();
    case WRITE_TYPE:
      return isSetWriteType();
    case PROPERTY:
      return isSetProperty();
    case PERMISSION:
      return isSetPermission();
    case HANDLE:
      return isSetHandle();
    case VALUE_HANDLE:
      return isSetValueHandle();
    case DESCRIPTORS:
      return isSetDescriptors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Characteristic)
      return this.equals((Characteristic)that);
    return false;
  }

  public boolean equals(Characteristic that) {
    if (that == null)
      return false;

    boolean this_present_uuid = true && this.isSetUuid();
    boolean that_present_uuid = true && that.isSetUuid();
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (!this.uuid.equals(that.uuid))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    boolean this_present_writeType = true;
    boolean that_present_writeType = true;
    if (this_present_writeType || that_present_writeType) {
      if (!(this_present_writeType && that_present_writeType))
        return false;
      if (this.writeType != that.writeType)
        return false;
    }

    boolean this_present_property = true;
    boolean that_present_property = true;
    if (this_present_property || that_present_property) {
      if (!(this_present_property && that_present_property))
        return false;
      if (this.property != that.property)
        return false;
    }

    boolean this_present_permission = true;
    boolean that_present_permission = true;
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (this.permission != that.permission)
        return false;
    }

    boolean this_present_handle = true;
    boolean that_present_handle = true;
    if (this_present_handle || that_present_handle) {
      if (!(this_present_handle && that_present_handle))
        return false;
      if (this.handle != that.handle)
        return false;
    }

    boolean this_present_valueHandle = true;
    boolean that_present_valueHandle = true;
    if (this_present_valueHandle || that_present_valueHandle) {
      if (!(this_present_valueHandle && that_present_valueHandle))
        return false;
      if (this.valueHandle != that.valueHandle)
        return false;
    }

    boolean this_present_descriptors = true && this.isSetDescriptors();
    boolean that_present_descriptors = true && that.isSetDescriptors();
    if (this_present_descriptors || that_present_descriptors) {
      if (!(this_present_descriptors && that_present_descriptors))
        return false;
      if (!this.descriptors.equals(that.descriptors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuid = true && (isSetUuid());
    list.add(present_uuid);
    if (present_uuid)
      list.add(uuid);

    boolean present_desc = true && (isSetDesc());
    list.add(present_desc);
    if (present_desc)
      list.add(desc);

    boolean present_writeType = true;
    list.add(present_writeType);
    if (present_writeType)
      list.add(writeType);

    boolean present_property = true;
    list.add(present_property);
    if (present_property)
      list.add(property);

    boolean present_permission = true;
    list.add(present_permission);
    if (present_permission)
      list.add(permission);

    boolean present_handle = true;
    list.add(present_handle);
    if (present_handle)
      list.add(handle);

    boolean present_valueHandle = true;
    list.add(present_valueHandle);
    if (present_valueHandle)
      list.add(valueHandle);

    boolean present_descriptors = true && (isSetDescriptors());
    list.add(present_descriptors);
    if (present_descriptors)
      list.add(descriptors);

    return list.hashCode();
  }

  @Override
  public int compareTo(Characteristic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteType()).compareTo(other.isSetWriteType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeType, other.writeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProperty()).compareTo(other.isSetProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.property, other.property);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermission()).compareTo(other.isSetPermission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermission()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.permission, other.permission);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHandle()).compareTo(other.isSetHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.handle, other.handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueHandle()).compareTo(other.isSetValueHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueHandle, other.valueHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescriptors()).compareTo(other.isSetDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descriptors, other.descriptors);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Characteristic(");
    boolean first = true;

    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeType:");
    sb.append(this.writeType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("property:");
    sb.append(this.property);
    first = false;
    if (!first) sb.append(", ");
    sb.append("permission:");
    sb.append(this.permission);
    first = false;
    if (!first) sb.append(", ");
    sb.append("handle:");
    sb.append(this.handle);
    first = false;
    if (!first) sb.append(", ");
    sb.append("valueHandle:");
    sb.append(this.valueHandle);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descriptors:");
    if (this.descriptors == null) {
      sb.append("null");
    } else {
      sb.append(this.descriptors);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CharacteristicStandardSchemeFactory implements SchemeFactory {
    public CharacteristicStandardScheme getScheme() {
      return new CharacteristicStandardScheme();
    }
  }

  private static class CharacteristicStandardScheme extends StandardScheme<Characteristic> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Characteristic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uuid = iprot.readString();
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.writeType = iprot.readI32();
              struct.setWriteTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.property = iprot.readI32();
              struct.setPropertyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PERMISSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.permission = iprot.readI32();
              struct.setPermissionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.handle = iprot.readI32();
              struct.setHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VALUE_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.valueHandle = iprot.readI32();
              struct.setValueHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.descriptors = new ArrayList<Descriptor>(_list8.size);
                Descriptor _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new Descriptor();
                  _elem9.read(iprot);
                  struct.descriptors.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setDescriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Characteristic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        oprot.writeString(struct.uuid);
        oprot.writeFieldEnd();
      }
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WRITE_TYPE_FIELD_DESC);
      oprot.writeI32(struct.writeType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PROPERTY_FIELD_DESC);
      oprot.writeI32(struct.property);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PERMISSION_FIELD_DESC);
      oprot.writeI32(struct.permission);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HANDLE_FIELD_DESC);
      oprot.writeI32(struct.handle);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALUE_HANDLE_FIELD_DESC);
      oprot.writeI32(struct.valueHandle);
      oprot.writeFieldEnd();
      if (struct.descriptors != null) {
        oprot.writeFieldBegin(DESCRIPTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.descriptors.size()));
          for (Descriptor _iter11 : struct.descriptors)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CharacteristicTupleSchemeFactory implements SchemeFactory {
    public CharacteristicTupleScheme getScheme() {
      return new CharacteristicTupleScheme();
    }
  }

  private static class CharacteristicTupleScheme extends TupleScheme<Characteristic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Characteristic struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUuid()) {
        optionals.set(0);
      }
      if (struct.isSetDesc()) {
        optionals.set(1);
      }
      if (struct.isSetWriteType()) {
        optionals.set(2);
      }
      if (struct.isSetProperty()) {
        optionals.set(3);
      }
      if (struct.isSetPermission()) {
        optionals.set(4);
      }
      if (struct.isSetHandle()) {
        optionals.set(5);
      }
      if (struct.isSetValueHandle()) {
        optionals.set(6);
      }
      if (struct.isSetDescriptors()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetUuid()) {
        oprot.writeString(struct.uuid);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
      if (struct.isSetWriteType()) {
        oprot.writeI32(struct.writeType);
      }
      if (struct.isSetProperty()) {
        oprot.writeI32(struct.property);
      }
      if (struct.isSetPermission()) {
        oprot.writeI32(struct.permission);
      }
      if (struct.isSetHandle()) {
        oprot.writeI32(struct.handle);
      }
      if (struct.isSetValueHandle()) {
        oprot.writeI32(struct.valueHandle);
      }
      if (struct.isSetDescriptors()) {
        {
          oprot.writeI32(struct.descriptors.size());
          for (Descriptor _iter12 : struct.descriptors)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Characteristic struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.uuid = iprot.readString();
        struct.setUuidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
      if (incoming.get(2)) {
        struct.writeType = iprot.readI32();
        struct.setWriteTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.property = iprot.readI32();
        struct.setPropertyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.permission = iprot.readI32();
        struct.setPermissionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.handle = iprot.readI32();
        struct.setHandleIsSet(true);
      }
      if (incoming.get(6)) {
        struct.valueHandle = iprot.readI32();
        struct.setValueHandleIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.descriptors = new ArrayList<Descriptor>(_list13.size);
          Descriptor _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new Descriptor();
            _elem14.read(iprot);
            struct.descriptors.add(_elem14);
          }
        }
        struct.setDescriptorsIsSet(true);
      }
    }
  }

}

