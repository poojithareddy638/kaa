/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-30")
public class UserConfigurationUpdate implements org.apache.thrift.TBase<UserConfigurationUpdate, UserConfigurationUpdate._Fields>, java.io.Serializable, Cloneable, Comparable<UserConfigurationUpdate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserConfigurationUpdate");

  private static final org.apache.thrift.protocol.TField TENANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationToken", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CF_SCHEMA_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("cfSchemaVersion", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField UCF_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("ucfHash", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserConfigurationUpdateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserConfigurationUpdateTupleSchemeFactory());
  }

  public String tenantId; // required
  public String userId; // required
  public String applicationToken; // required
  public int cfSchemaVersion; // required
  public ByteBuffer ucfHash; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TENANT_ID((short)1, "tenantId"),
    USER_ID((short)2, "userId"),
    APPLICATION_TOKEN((short)3, "applicationToken"),
    CF_SCHEMA_VERSION((short)4, "cfSchemaVersion"),
    UCF_HASH((short)5, "ucfHash");

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
        case 1: // TENANT_ID
          return TENANT_ID;
        case 2: // USER_ID
          return USER_ID;
        case 3: // APPLICATION_TOKEN
          return APPLICATION_TOKEN;
        case 4: // CF_SCHEMA_VERSION
          return CF_SCHEMA_VERSION;
        case 5: // UCF_HASH
          return UCF_HASH;
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
  private static final int __CFSCHEMAVERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TENANT_ID, new org.apache.thrift.meta_data.FieldMetaData("tenantId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "tenant_id")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "user_id")));
    tmpMap.put(_Fields.APPLICATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("applicationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "application_token")));
    tmpMap.put(_Fields.CF_SCHEMA_VERSION, new org.apache.thrift.meta_data.FieldMetaData("cfSchemaVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.UCF_HASH, new org.apache.thrift.meta_data.FieldMetaData("ucfHash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserConfigurationUpdate.class, metaDataMap);
  }

  public UserConfigurationUpdate() {
  }

  public UserConfigurationUpdate(
    String tenantId,
    String userId,
    String applicationToken,
    int cfSchemaVersion,
    ByteBuffer ucfHash)
  {
    this();
    this.tenantId = tenantId;
    this.userId = userId;
    this.applicationToken = applicationToken;
    this.cfSchemaVersion = cfSchemaVersion;
    setCfSchemaVersionIsSet(true);
    this.ucfHash = org.apache.thrift.TBaseHelper.copyBinary(ucfHash);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserConfigurationUpdate(UserConfigurationUpdate other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTenantId()) {
      this.tenantId = other.tenantId;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetApplicationToken()) {
      this.applicationToken = other.applicationToken;
    }
    this.cfSchemaVersion = other.cfSchemaVersion;
    if (other.isSetUcfHash()) {
      this.ucfHash = org.apache.thrift.TBaseHelper.copyBinary(other.ucfHash);
    }
  }

  public UserConfigurationUpdate deepCopy() {
    return new UserConfigurationUpdate(this);
  }

  @Override
  public void clear() {
    this.tenantId = null;
    this.userId = null;
    this.applicationToken = null;
    setCfSchemaVersionIsSet(false);
    this.cfSchemaVersion = 0;
    this.ucfHash = null;
  }

  public String getTenantId() {
    return this.tenantId;
  }

  public UserConfigurationUpdate setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public void unsetTenantId() {
    this.tenantId = null;
  }

  /** Returns true if field tenantId is set (has been assigned a value) and false otherwise */
  public boolean isSetTenantId() {
    return this.tenantId != null;
  }

  public void setTenantIdIsSet(boolean value) {
    if (!value) {
      this.tenantId = null;
    }
  }

  public String getUserId() {
    return this.userId;
  }

  public UserConfigurationUpdate setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public String getApplicationToken() {
    return this.applicationToken;
  }

  public UserConfigurationUpdate setApplicationToken(String applicationToken) {
    this.applicationToken = applicationToken;
    return this;
  }

  public void unsetApplicationToken() {
    this.applicationToken = null;
  }

  /** Returns true if field applicationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationToken() {
    return this.applicationToken != null;
  }

  public void setApplicationTokenIsSet(boolean value) {
    if (!value) {
      this.applicationToken = null;
    }
  }

  public int getCfSchemaVersion() {
    return this.cfSchemaVersion;
  }

  public UserConfigurationUpdate setCfSchemaVersion(int cfSchemaVersion) {
    this.cfSchemaVersion = cfSchemaVersion;
    setCfSchemaVersionIsSet(true);
    return this;
  }

  public void unsetCfSchemaVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CFSCHEMAVERSION_ISSET_ID);
  }

  /** Returns true if field cfSchemaVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetCfSchemaVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __CFSCHEMAVERSION_ISSET_ID);
  }

  public void setCfSchemaVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CFSCHEMAVERSION_ISSET_ID, value);
  }

  public byte[] getUcfHash() {
    setUcfHash(org.apache.thrift.TBaseHelper.rightSize(ucfHash));
    return ucfHash == null ? null : ucfHash.array();
  }

  public ByteBuffer bufferForUcfHash() {
    return org.apache.thrift.TBaseHelper.copyBinary(ucfHash);
  }

  public UserConfigurationUpdate setUcfHash(byte[] ucfHash) {
    this.ucfHash = ucfHash == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(ucfHash, ucfHash.length));
    return this;
  }

  public UserConfigurationUpdate setUcfHash(ByteBuffer ucfHash) {
    this.ucfHash = org.apache.thrift.TBaseHelper.copyBinary(ucfHash);
    return this;
  }

  public void unsetUcfHash() {
    this.ucfHash = null;
  }

  /** Returns true if field ucfHash is set (has been assigned a value) and false otherwise */
  public boolean isSetUcfHash() {
    return this.ucfHash != null;
  }

  public void setUcfHashIsSet(boolean value) {
    if (!value) {
      this.ucfHash = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TENANT_ID:
      if (value == null) {
        unsetTenantId();
      } else {
        setTenantId((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case APPLICATION_TOKEN:
      if (value == null) {
        unsetApplicationToken();
      } else {
        setApplicationToken((String)value);
      }
      break;

    case CF_SCHEMA_VERSION:
      if (value == null) {
        unsetCfSchemaVersion();
      } else {
        setCfSchemaVersion((Integer)value);
      }
      break;

    case UCF_HASH:
      if (value == null) {
        unsetUcfHash();
      } else {
        setUcfHash((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TENANT_ID:
      return getTenantId();

    case USER_ID:
      return getUserId();

    case APPLICATION_TOKEN:
      return getApplicationToken();

    case CF_SCHEMA_VERSION:
      return Integer.valueOf(getCfSchemaVersion());

    case UCF_HASH:
      return getUcfHash();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TENANT_ID:
      return isSetTenantId();
    case USER_ID:
      return isSetUserId();
    case APPLICATION_TOKEN:
      return isSetApplicationToken();
    case CF_SCHEMA_VERSION:
      return isSetCfSchemaVersion();
    case UCF_HASH:
      return isSetUcfHash();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserConfigurationUpdate)
      return this.equals((UserConfigurationUpdate)that);
    return false;
  }

  public boolean equals(UserConfigurationUpdate that) {
    if (that == null)
      return false;

    boolean this_present_tenantId = true && this.isSetTenantId();
    boolean that_present_tenantId = true && that.isSetTenantId();
    if (this_present_tenantId || that_present_tenantId) {
      if (!(this_present_tenantId && that_present_tenantId))
        return false;
      if (!this.tenantId.equals(that.tenantId))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_applicationToken = true && this.isSetApplicationToken();
    boolean that_present_applicationToken = true && that.isSetApplicationToken();
    if (this_present_applicationToken || that_present_applicationToken) {
      if (!(this_present_applicationToken && that_present_applicationToken))
        return false;
      if (!this.applicationToken.equals(that.applicationToken))
        return false;
    }

    boolean this_present_cfSchemaVersion = true;
    boolean that_present_cfSchemaVersion = true;
    if (this_present_cfSchemaVersion || that_present_cfSchemaVersion) {
      if (!(this_present_cfSchemaVersion && that_present_cfSchemaVersion))
        return false;
      if (this.cfSchemaVersion != that.cfSchemaVersion)
        return false;
    }

    boolean this_present_ucfHash = true && this.isSetUcfHash();
    boolean that_present_ucfHash = true && that.isSetUcfHash();
    if (this_present_ucfHash || that_present_ucfHash) {
      if (!(this_present_ucfHash && that_present_ucfHash))
        return false;
      if (!this.ucfHash.equals(that.ucfHash))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tenantId = true && (isSetTenantId());
    list.add(present_tenantId);
    if (present_tenantId)
      list.add(tenantId);

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_applicationToken = true && (isSetApplicationToken());
    list.add(present_applicationToken);
    if (present_applicationToken)
      list.add(applicationToken);

    boolean present_cfSchemaVersion = true;
    list.add(present_cfSchemaVersion);
    if (present_cfSchemaVersion)
      list.add(cfSchemaVersion);

    boolean present_ucfHash = true && (isSetUcfHash());
    list.add(present_ucfHash);
    if (present_ucfHash)
      list.add(ucfHash);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserConfigurationUpdate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTenantId()).compareTo(other.isSetTenantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTenantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tenantId, other.tenantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationToken()).compareTo(other.isSetApplicationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationToken, other.applicationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCfSchemaVersion()).compareTo(other.isSetCfSchemaVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCfSchemaVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cfSchemaVersion, other.cfSchemaVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUcfHash()).compareTo(other.isSetUcfHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUcfHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ucfHash, other.ucfHash);
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
    StringBuilder sb = new StringBuilder("UserConfigurationUpdate(");
    boolean first = true;

    sb.append("tenantId:");
    if (this.tenantId == null) {
      sb.append("null");
    } else {
      sb.append(this.tenantId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationToken:");
    if (this.applicationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cfSchemaVersion:");
    sb.append(this.cfSchemaVersion);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ucfHash:");
    if (this.ucfHash == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.ucfHash, sb);
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

  private static class UserConfigurationUpdateStandardSchemeFactory implements SchemeFactory {
    public UserConfigurationUpdateStandardScheme getScheme() {
      return new UserConfigurationUpdateStandardScheme();
    }
  }

  private static class UserConfigurationUpdateStandardScheme extends StandardScheme<UserConfigurationUpdate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserConfigurationUpdate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TENANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tenantId = iprot.readString();
              struct.setTenantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationToken = iprot.readString();
              struct.setApplicationTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CF_SCHEMA_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cfSchemaVersion = iprot.readI32();
              struct.setCfSchemaVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UCF_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ucfHash = iprot.readBinary();
              struct.setUcfHashIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserConfigurationUpdate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tenantId != null) {
        oprot.writeFieldBegin(TENANT_ID_FIELD_DESC);
        oprot.writeString(struct.tenantId);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.applicationToken != null) {
        oprot.writeFieldBegin(APPLICATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.applicationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CF_SCHEMA_VERSION_FIELD_DESC);
      oprot.writeI32(struct.cfSchemaVersion);
      oprot.writeFieldEnd();
      if (struct.ucfHash != null) {
        oprot.writeFieldBegin(UCF_HASH_FIELD_DESC);
        oprot.writeBinary(struct.ucfHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserConfigurationUpdateTupleSchemeFactory implements SchemeFactory {
    public UserConfigurationUpdateTupleScheme getScheme() {
      return new UserConfigurationUpdateTupleScheme();
    }
  }

  private static class UserConfigurationUpdateTupleScheme extends TupleScheme<UserConfigurationUpdate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserConfigurationUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTenantId()) {
        optionals.set(0);
      }
      if (struct.isSetUserId()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationToken()) {
        optionals.set(2);
      }
      if (struct.isSetCfSchemaVersion()) {
        optionals.set(3);
      }
      if (struct.isSetUcfHash()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTenantId()) {
        oprot.writeString(struct.tenantId);
      }
      if (struct.isSetUserId()) {
        oprot.writeString(struct.userId);
      }
      if (struct.isSetApplicationToken()) {
        oprot.writeString(struct.applicationToken);
      }
      if (struct.isSetCfSchemaVersion()) {
        oprot.writeI32(struct.cfSchemaVersion);
      }
      if (struct.isSetUcfHash()) {
        oprot.writeBinary(struct.ucfHash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserConfigurationUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tenantId = iprot.readString();
        struct.setTenantIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userId = iprot.readString();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationToken = iprot.readString();
        struct.setApplicationTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cfSchemaVersion = iprot.readI32();
        struct.setCfSchemaVersionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ucfHash = iprot.readBinary();
        struct.setUcfHashIsSet(true);
      }
    }
  }

}

