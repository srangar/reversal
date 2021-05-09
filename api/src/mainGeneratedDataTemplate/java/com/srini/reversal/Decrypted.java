
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/srini/reversal/Decrypted.pdl.")
public class Decrypted
    extends RecordTemplate
{

    private final static Decrypted.Fields _fields = new Decrypted.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Decrypted\",\"namespace\":\"com.srini.reversal\",\"doc\":\"Generate a Reversed Word Response\",\"fields\":[{\"name\":\"decrypted\",\"type\":\"string\",\"doc\":\"The Decrypted String\"}]}"));
    private final static RecordDataSchema.Field FIELD_Decrypted = SCHEMA.getField("decrypted");

    public Decrypted() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Decrypted(DataMap data) {
        super(data, SCHEMA);
    }

    public static Decrypted.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for decrypted
     * 
     * @see Decrypted.Fields#decrypted
     */
    public boolean hasDecrypted() {
        return contains(FIELD_Decrypted);
    }

    /**
     * Remover for decrypted
     * 
     * @see Decrypted.Fields#decrypted
     */
    public void removeDecrypted() {
        remove(FIELD_Decrypted);
    }

    /**
     * Getter for decrypted
     * 
     * @see Decrypted.Fields#decrypted
     */
    public String getDecrypted(GetMode mode) {
        return obtainDirect(FIELD_Decrypted, String.class, mode);
    }

    /**
     * Getter for decrypted
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Decrypted.Fields#decrypted
     */
    @Nonnull
    public String getDecrypted() {
        return obtainDirect(FIELD_Decrypted, String.class, GetMode.STRICT);
    }

    /**
     * Setter for decrypted
     * 
     * @see Decrypted.Fields#decrypted
     */
    public Decrypted setDecrypted(String value, SetMode mode) {
        putDirect(FIELD_Decrypted, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for decrypted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Decrypted.Fields#decrypted
     */
    public Decrypted setDecrypted(
        @Nonnull
        String value) {
        putDirect(FIELD_Decrypted, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Decrypted clone()
        throws CloneNotSupportedException
    {
        return ((Decrypted) super.clone());
    }

    @Override
    public Decrypted copy()
        throws CloneNotSupportedException
    {
        return ((Decrypted) super.copy());
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
         * The Decrypted String
         * 
         */
        public PathSpec decrypted() {
            return new PathSpec(getPathComponents(), "decrypted");
        }

    }

}
