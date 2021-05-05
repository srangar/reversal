
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
 * Generate a StringCheck Response
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/srini/reversal/StringCheck.pdl.")
public class StringCheck
    extends RecordTemplate
{

    private final static StringCheck.Fields _fields = new StringCheck.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"StringCheck\",\"namespace\":\"com.srini.reversal\",\"doc\":\"Generate a StringCheck Response\",\"fields\":[{\"name\":\"isValid\",\"type\":\"boolean\"}]}"));
    private final static RecordDataSchema.Field FIELD_IsValid = SCHEMA.getField("isValid");

    public StringCheck() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public StringCheck(DataMap data) {
        super(data, SCHEMA);
    }

    public static StringCheck.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for isValid
     * 
     * @see StringCheck.Fields#isValid
     */
    public boolean hasIsValid() {
        return contains(FIELD_IsValid);
    }

    /**
     * Remover for isValid
     * 
     * @see StringCheck.Fields#isValid
     */
    public void removeIsValid() {
        remove(FIELD_IsValid);
    }

    /**
     * Getter for isValid
     * 
     * @see StringCheck.Fields#isValid
     */
    public Boolean isIsValid(GetMode mode) {
        return obtainDirect(FIELD_IsValid, Boolean.class, mode);
    }

    /**
     * Getter for isValid
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StringCheck.Fields#isValid
     */
    @Nonnull
    public Boolean isIsValid() {
        return obtainDirect(FIELD_IsValid, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for isValid
     * 
     * @see StringCheck.Fields#isValid
     */
    public StringCheck setIsValid(Boolean value, SetMode mode) {
        putDirect(FIELD_IsValid, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for isValid
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StringCheck.Fields#isValid
     */
    public StringCheck setIsValid(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_IsValid, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for isValid
     * 
     * @see StringCheck.Fields#isValid
     */
    public StringCheck setIsValid(boolean value) {
        putDirect(FIELD_IsValid, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public StringCheck clone()
        throws CloneNotSupportedException
    {
        return ((StringCheck) super.clone());
    }

    @Override
    public StringCheck copy()
        throws CloneNotSupportedException
    {
        return ((StringCheck) super.copy());
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

        public PathSpec isValid() {
            return new PathSpec(getPathComponents(), "isValid");
        }

    }

}
