
package com.srini.reversal;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Generate a Reversed Word Response
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/srini/reversal/Encrypted.pdl.")
public class Encrypted
    extends RecordTemplate
{

    private final static Encrypted.Fields _fields = new Encrypted.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Encrypted\",\"namespace\":\"com.srini.reversal\",\"doc\":\"Generate a Reversed Word Response\",\"fields\":[{\"name\":\"encrypted\",\"type\":\"string\",\"doc\":\"The Encrypted String\"}]}"));
    private final static RecordDataSchema.Field FIELD_Encrypted = SCHEMA.getField("encrypted");

    public Encrypted() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Encrypted(DataMap data) {
        super(data, SCHEMA);
    }

    public static Encrypted.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for encrypted
     * 
     * @see Encrypted.Fields#encrypted
     */
    public boolean hasEncrypted() {
        return contains(FIELD_Encrypted);
    }

    /**
     * Remover for encrypted
     * 
     * @see Encrypted.Fields#encrypted
     */
    public void removeEncrypted() {
        remove(FIELD_Encrypted);
    }

    /**
     * Getter for encrypted
     * 
     * @see Encrypted.Fields#encrypted
     */
    public String getEncrypted(GetMode mode) {
        return obtainDirect(FIELD_Encrypted, String.class, mode);
    }

    /**
     * Getter for encrypted
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Encrypted.Fields#encrypted
     */
    @Nonnull
    public String getEncrypted() {
        return obtainDirect(FIELD_Encrypted, String.class, GetMode.STRICT);
    }

    /**
     * Setter for encrypted
     * 
     * @see Encrypted.Fields#encrypted
     */
    public Encrypted setEncrypted(String value, SetMode mode) {
        putDirect(FIELD_Encrypted, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for encrypted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Encrypted.Fields#encrypted
     */
    public Encrypted setEncrypted(
        @Nonnull
        String value) {
        putDirect(FIELD_Encrypted, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Encrypted clone()
        throws CloneNotSupportedException
    {
        return ((Encrypted) super.clone());
    }

    @Override
    public Encrypted copy()
        throws CloneNotSupportedException
    {
        return ((Encrypted) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * The Encrypted String
         * 
         */
        public PathSpec encrypted() {
            return new PathSpec(getPathComponents(), "encrypted");
        }

    }

}
