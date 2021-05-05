
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/srini/reversal/ReversedWord.pdl.")
public class ReversedWord
        extends RecordTemplate
{

    private final static ReversedWord.Fields _fields = new ReversedWord.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"ReversedWord\",\"namespace\":\"com.srini.reversal\",\"doc\":\"Generate a Reversed Word Response\",\"fields\":[{\"name\":\"reversed\",\"type\":\"string\",\"doc\":\"The Reversed String\"}]}"));
    private final static RecordDataSchema.Field FIELD_Reversed = SCHEMA.getField("reversed");

    public ReversedWord() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ReversedWord(DataMap data) {
        super(data, SCHEMA);
    }

    public static ReversedWord.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for reversed
     *
     * @see ReversedWord.Fields#reversed
     */
    public boolean hasReversed() {
        return contains(FIELD_Reversed);
    }

    /**
     * Remover for reversed
     *
     * @see ReversedWord.Fields#reversed
     */
    public void removeReversed() {
        remove(FIELD_Reversed);
    }

    /**
     * Getter for reversed
     *
     * @see ReversedWord.Fields#reversed
     */
    public String getReversed(GetMode mode) {
        return obtainDirect(FIELD_Reversed, String.class, mode);
    }

    /**
     * Getter for reversed
     *
     * @return
     *     Required field. Could be null for partial record.
     * @see ReversedWord.Fields#reversed
     */
    @Nonnull
    public String getReversed() {
        return obtainDirect(FIELD_Reversed, String.class, GetMode.STRICT);
    }

    /**
     * Setter for reversed
     *
     * @see ReversedWord.Fields#reversed
     */
    public ReversedWord setReversed(String value, SetMode mode) {
        putDirect(FIELD_Reversed, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for reversed
     *
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ReversedWord.Fields#reversed
     */
    public ReversedWord setReversed(
            @Nonnull
                    String value) {
        putDirect(FIELD_Reversed, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ReversedWord clone()
            throws CloneNotSupportedException
    {
        return ((ReversedWord) super.clone());
    }

    @Override
    public ReversedWord copy()
            throws CloneNotSupportedException
    {
        return ((ReversedWord) super.copy());
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
         * The Reversed String
         *
         */
        public PathSpec reversed() {
            return new PathSpec(getPathComponents(), "reversed");
        }

    }

}
