/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class consensus implements consensusConstants {
  public static verify_result verify_script(SWIGTYPE_p_unsigned_char transaction, long transaction_size, SWIGTYPE_p_unsigned_char prevout_script, long prevout_script_size, java.math.BigInteger prevout_value, long tx_input_index, long flags) {
    return verify_result.swigToEnum(consensusJNI.verify_script(SWIGTYPE_p_unsigned_char.getCPtr(transaction), transaction_size, SWIGTYPE_p_unsigned_char.getCPtr(prevout_script), prevout_script_size, prevout_value, tx_input_index, flags));
  }

}
