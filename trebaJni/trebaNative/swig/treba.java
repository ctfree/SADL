/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package treba;

public class treba implements trebaConstants {
  public static void setFsm_counts(SWIGTYPE_p_double value) {
    trebaJNI.fsm_counts_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getFsm_counts() {
    long cPtr = trebaJNI.fsm_counts_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setFsm_totalcounts(SWIGTYPE_p_double value) {
    trebaJNI.fsm_totalcounts_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getFsm_totalcounts() {
    long cPtr = trebaJNI.fsm_totalcounts_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setFsm_finalcounts(SWIGTYPE_p_double value) {
    trebaJNI.fsm_finalcounts_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getFsm_finalcounts() {
    long cPtr = trebaJNI.fsm_finalcounts_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setFsm_counts_spin(SWIGTYPE_p__Bool value) {
    trebaJNI.fsm_counts_spin_set(SWIGTYPE_p__Bool.getCPtr(value));
  }

  public static SWIGTYPE_p__Bool getFsm_counts_spin() {
    long cPtr = trebaJNI.fsm_counts_spin_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p__Bool(cPtr, false);
  }

  public static void setHmm_counts_trans(SWIGTYPE_p_double value) {
    trebaJNI.hmm_counts_trans_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getHmm_counts_trans() {
    long cPtr = trebaJNI.hmm_counts_trans_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setHmm_counts_emit(SWIGTYPE_p_double value) {
    trebaJNI.hmm_counts_emit_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getHmm_counts_emit() {
    long cPtr = trebaJNI.hmm_counts_emit_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setHmm_totalcounts_trans(SWIGTYPE_p_double value) {
    trebaJNI.hmm_totalcounts_trans_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getHmm_totalcounts_trans() {
    long cPtr = trebaJNI.hmm_totalcounts_trans_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setHmm_totalcounts_emit(SWIGTYPE_p_double value) {
    trebaJNI.hmm_totalcounts_emit_set(SWIGTYPE_p_double.getCPtr(value));
  }

  public static SWIGTYPE_p_double getHmm_totalcounts_emit() {
    long cPtr = trebaJNI.hmm_totalcounts_emit_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void setHmm_counts_spin(SWIGTYPE_p__Bool value) {
    trebaJNI.hmm_counts_spin_set(SWIGTYPE_p__Bool.getCPtr(value));
  }

  public static SWIGTYPE_p__Bool getHmm_counts_spin() {
    long cPtr = trebaJNI.hmm_counts_spin_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p__Bool(cPtr, false);
  }

  public static void setG_obsarray(observations value) {
    trebaJNI.g_obsarray_set(observations.getCPtr(value), value);
  }

  public static observations getG_obsarray() {
    long cPtr = trebaJNI.g_obsarray_get();
    return (cPtr == 0) ? null : new observations(cPtr, false);
  }

  public static double output_convert(double x) {
    return trebaJNI.output_convert(x);
  }

  public static double input_convert(double x) {
    return trebaJNI.input_convert(x);
  }

  public static String file_to_mem(String name) {
    return trebaJNI.file_to_mem(name);
  }

  public static int char_in_array(char c, String array) {
    return trebaJNI.char_in_array(c, array);
  }

  public static int line_count_elements(SWIGTYPE_p_p_char ptr) {
    return trebaJNI.line_count_elements(SWIGTYPE_p_p_char.getCPtr(ptr));
  }

  public static String line_to_int_array(String ptr, SWIGTYPE_p_p_int line, SWIGTYPE_p_int size) {
    return trebaJNI.line_to_int_array(ptr, SWIGTYPE_p_p_int.getCPtr(line), SWIGTYPE_p_int.getCPtr(size));
  }

  public static void hmm_print(hmm hmm) {
    trebaJNI.hmm_print(hmm.getCPtr(hmm), hmm);
  }

  public static hmm hmm_init(int num_states, int alphabet_size) {
    long cPtr = trebaJNI.hmm_init(num_states, alphabet_size);
    return (cPtr == 0) ? null : new hmm(cPtr, false);
  }

  public static void hmm_destroy(hmm hmm) {
    trebaJNI.hmm_destroy(hmm.getCPtr(hmm), hmm);
  }

  public static void hmm_randomize(hmm hmm, int bakis, int uniform) {
    trebaJNI.hmm_randomize(hmm.getCPtr(hmm), hmm, bakis, uniform);
  }

  public static void hmm_to_log2(hmm hmm) {
    trebaJNI.hmm_to_log2(hmm.getCPtr(hmm), hmm);
  }

  public static hmm hmm_read_file(String filename) {
    long cPtr = trebaJNI.hmm_read_file(filename);
    return (cPtr == 0) ? null : new hmm(cPtr, false);
  }

  public static double train_viterbi_bw_hmm(hmm hmm, observations o) {
    return trebaJNI.train_viterbi_bw_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o);
  }

  public static double train_viterbi_hmm(hmm hmm, observations o, int maxiterations, double maxdelta) {
    return trebaJNI.train_viterbi_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, maxiterations, maxdelta);
  }

  public static void viterbi_hmm(hmm hmm, observations o, int algorithm) {
    trebaJNI.viterbi_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, algorithm);
  }

  public static void generate_words_hmm(hmm hmm, int numwords) {
    trebaJNI.generate_words_hmm(hmm.getCPtr(hmm), hmm, numwords);
  }

  public static double train_bw_hmm(hmm hmm, observations o, int maxiterations, double maxdelta) {
    return trebaJNI.train_bw_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, maxiterations, maxdelta);
  }

  public static double gibbs_sampler_fsm(wfsa fsm, observations o, double beta, int num_states, int maxiter, int burnin, int lag) {
    return trebaJNI.gibbs_sampler_fsm(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, beta, num_states, maxiter, burnin, lag);
  }

  public static double gibbs_sampler_hmm(hmm hmm, observations o, double beta_e, double beta_t, int num_states, int maxiter, int burnin, int lag) {
    return trebaJNI.gibbs_sampler_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, beta_e, beta_t, num_states, maxiter, burnin, lag);
  }

  public static hmm gibbs_counts_to_hmm(hmm hmm, SWIGTYPE_p_unsigned_int gibbs_sampled_counts_trans, SWIGTYPE_p_unsigned_int gibbs_sampled_counts_emit, SWIGTYPE_p_unsigned_int gibbs_counts_sampled_states, int alphabet_size, int num_states, double beta_t, double beta_e) {
    long cPtr = trebaJNI.gibbs_counts_to_hmm(hmm.getCPtr(hmm), hmm, SWIGTYPE_p_unsigned_int.getCPtr(gibbs_sampled_counts_trans), SWIGTYPE_p_unsigned_int.getCPtr(gibbs_sampled_counts_emit), SWIGTYPE_p_unsigned_int.getCPtr(gibbs_counts_sampled_states), alphabet_size, num_states, beta_t, beta_e);
    return (cPtr == 0) ? null : new hmm(cPtr, false);
  }

  public static wfsa gibbs_counts_to_wfsa(wfsa fsm, SWIGTYPE_p_unsigned_int gibbs_sampled_counts, SWIGTYPE_p_unsigned_int gibbs_counts_sampled_states, int alphabet_size, int num_states, double beta, double ANbeta) {
    long cPtr = trebaJNI.gibbs_counts_to_wfsa(wfsa.getCPtr(fsm), fsm, SWIGTYPE_p_unsigned_int.getCPtr(gibbs_sampled_counts), SWIGTYPE_p_unsigned_int.getCPtr(gibbs_counts_sampled_states), alphabet_size, num_states, beta, ANbeta);
    return (cPtr == 0) ? null : new wfsa(cPtr, false);
  }

  public static gibbs_state_chain gibbs_init_fsm(observations o, int num_states, int alphabet_size, SWIGTYPE_p_int obslen) {
    long cPtr = trebaJNI.gibbs_init_fsm(observations.getCPtr(o), o, num_states, alphabet_size, SWIGTYPE_p_int.getCPtr(obslen));
    return (cPtr == 0) ? null : new gibbs_state_chain(cPtr, false);
  }

  public static gibbs_state_chain gibbs_init_hmm(observations o, int num_states, int alphabet_size, SWIGTYPE_p_int obslen) {
    long cPtr = trebaJNI.gibbs_init_hmm(observations.getCPtr(o), o, num_states, alphabet_size, SWIGTYPE_p_int.getCPtr(obslen));
    return (cPtr == 0) ? null : new gibbs_state_chain(cPtr, false);
  }

  public static void interrupt_sigproc() {
    trebaJNI.interrupt_sigproc();
  }

  public static void spinlock_lock(SWIGTYPE_p__Bool ptr) {
    trebaJNI.spinlock_lock(SWIGTYPE_p__Bool.getCPtr(ptr));
  }

  public static void spinlock_unlock(SWIGTYPE_p__Bool ptr) {
    trebaJNI.spinlock_unlock(SWIGTYPE_p__Bool.getCPtr(ptr));
  }

  public static double rand_double() {
    return trebaJNI.rand_double();
  }

  public static int rand_int_range(int from, int to) {
    return trebaJNI.rand_int_range(from, to);
  }

  public static wfsa wfsa_read_file(String filename) {
    long cPtr = trebaJNI.wfsa_read_file(filename);
    return (cPtr == 0) ? null : new wfsa(cPtr, false);
  }

  public static void wfsa_print(wfsa fsm) {
    trebaJNI.wfsa_print(wfsa.getCPtr(fsm), fsm);
  }

  public static void wfsa_to_file(wfsa fsm, String filename) {
    trebaJNI.wfsa_to_file(wfsa.getCPtr(fsm), fsm, filename);
  }

  public static void wfsa_randomize_deterministic(wfsa fsm, int uniform) {
    trebaJNI.wfsa_randomize_deterministic(wfsa.getCPtr(fsm), fsm, uniform);
  }

  public static void wfsa_randomize_nondeterministic(wfsa fsm, int bakis, int uniform) {
    trebaJNI.wfsa_randomize_nondeterministic(wfsa.getCPtr(fsm), fsm, bakis, uniform);
  }

  public static wfsa wfsa_init(int num_states, int alphabet_size) {
    long cPtr = trebaJNI.wfsa_init(num_states, alphabet_size);
    return (cPtr == 0) ? null : new wfsa(cPtr, false);
  }

  public static wfsa wfsa_copy(wfsa fsm) {
    long cPtr = trebaJNI.wfsa_copy(wfsa.getCPtr(fsm), fsm);
    return (cPtr == 0) ? null : new wfsa(cPtr, false);
  }

  public static void wfsa_destroy(wfsa fsm) {
    trebaJNI.wfsa_destroy(wfsa.getCPtr(fsm), fsm);
  }

  public static void wfsa_to_log2(wfsa fsm) {
    trebaJNI.wfsa_to_log2(wfsa.getCPtr(fsm), fsm);
  }

  public static double wfsa_sum_prob(wfsa fsm, int state) {
    return trebaJNI.wfsa_sum_prob(wfsa.getCPtr(fsm), fsm, state);
  }

  public static int wfsa_random_transition(wfsa fsm, int state, SWIGTYPE_p_int symbol, SWIGTYPE_p_double prob) {
    return trebaJNI.wfsa_random_transition(wfsa.getCPtr(fsm), fsm, state, SWIGTYPE_p_int.getCPtr(symbol), SWIGTYPE_p_double.getCPtr(prob));
  }

  public static void generate_words(wfsa fsm, int numwords) {
    trebaJNI.generate_words(wfsa.getCPtr(fsm), fsm, numwords);
  }

  public static int obssortcmp(SWIGTYPE_p_p_observations a, SWIGTYPE_p_p_observations b) {
    return trebaJNI.obssortcmp(SWIGTYPE_p_p_observations.getCPtr(a), SWIGTYPE_p_p_observations.getCPtr(b));
  }

  public static int observations_alphabet_size(observations ohead) {
    return trebaJNI.observations_alphabet_size(observations.getCPtr(ohead), ohead);
  }

  public static SWIGTYPE_p_p_observations observations_to_array(observations ohead, SWIGTYPE_p_int numobs) {
    long cPtr = trebaJNI.observations_to_array(observations.getCPtr(ohead), ohead, SWIGTYPE_p_int.getCPtr(numobs));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_observations(cPtr, false);
  }

  public static observations observations_uniq(observations ohead) {
    long cPtr = trebaJNI.observations_uniq(observations.getCPtr(ohead), ohead);
    return (cPtr == 0) ? null : new observations(cPtr, false);
  }

  public static observations observations_sort(observations ohead) {
    long cPtr = trebaJNI.observations_sort(observations.getCPtr(ohead), ohead);
    return (cPtr == 0) ? null : new observations(cPtr, false);
  }

  public static void observations_destroy(observations ohead) {
    trebaJNI.observations_destroy(observations.getCPtr(ohead), ohead);
  }

  public static observations observations_read(String filename) {
    long cPtr = trebaJNI.observations_read(filename);
    return (cPtr == 0) ? null : new observations(cPtr, false);
  }

  public static double loglikelihood_all_observations_fsm(wfsa fsm, observations o) {
    return trebaJNI.loglikelihood_all_observations_fsm(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o);
  }

  public static double loglikelihood_all_observations_hmm(hmm hmm, observations o) {
    return trebaJNI.loglikelihood_all_observations_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o);
  }

  public static double trellis_backward(trellis trellis, SWIGTYPE_p_int obs, int length, wfsa fsm) {
    return trebaJNI.trellis_backward(trellis.getCPtr(trellis), trellis, SWIGTYPE_p_int.getCPtr(obs), length, wfsa.getCPtr(fsm), fsm);
  }

  public static double trellis_viterbi(trellis trellis, SWIGTYPE_p_int obs, int length, wfsa fsm) {
    return trebaJNI.trellis_viterbi(trellis.getCPtr(trellis), trellis, SWIGTYPE_p_int.getCPtr(obs), length, wfsa.getCPtr(fsm), fsm);
  }

  public static double trellis_forward_fsm(trellis trellis, SWIGTYPE_p_int obs, int length, wfsa fsm) {
    return trebaJNI.trellis_forward_fsm(trellis.getCPtr(trellis), trellis, SWIGTYPE_p_int.getCPtr(obs), length, wfsa.getCPtr(fsm), fsm);
  }

  public static double trellis_forward_hmm(trellis trellis, SWIGTYPE_p_int obs, int length, hmm hmm) {
    return trebaJNI.trellis_forward_hmm(trellis.getCPtr(trellis), trellis, SWIGTYPE_p_int.getCPtr(obs), length, hmm.getCPtr(hmm), hmm);
  }

  public static trellis trellis_init(observations o, int num_states) {
    long cPtr = trebaJNI.trellis_init(observations.getCPtr(o), o, num_states);
    return (cPtr == 0) ? null : new trellis(cPtr, false);
  }

  public static void trellis_print(trellis trellis, wfsa fsm, int obs_len) {
    trebaJNI.trellis_print(trellis.getCPtr(trellis), trellis, wfsa.getCPtr(fsm), fsm, obs_len);
  }

  public static void forward_print_path(trellis trellis, wfsa fsm, int obs_len) {
    trebaJNI.forward_print_path(trellis.getCPtr(trellis), trellis, wfsa.getCPtr(fsm), fsm, obs_len);
  }

  public static void backward_print_path(trellis trellis, wfsa fsm, int obs_len) {
    trebaJNI.backward_print_path(trellis.getCPtr(trellis), trellis, wfsa.getCPtr(fsm), fsm, obs_len);
  }

  public static void viterbi_print_path(trellis trellis, wfsa fsm, int obs_len) {
    trebaJNI.viterbi_print_path(trellis.getCPtr(trellis), trellis, wfsa.getCPtr(fsm), fsm, obs_len);
  }

  public static void viterbi(wfsa fsm, observations o, int algorithm) {
    trebaJNI.viterbi(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, algorithm);
  }

  public static void forward_fsm(wfsa fsm, observations o, int algorithm) {
    trebaJNI.forward_fsm(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, algorithm);
  }

  public static void forward_fsm_to_file(wfsa fsm, observations o, int algorithm, String filename) {
    trebaJNI.forward_fsm_to_file(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, algorithm, filename);
  }

  public static void forward_hmm(hmm hmm, observations o, int algorithm) {
    trebaJNI.forward_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, algorithm);
  }

  public static void backward_fsm(wfsa fsm, observations o, int algorithm) {
    trebaJNI.backward_fsm(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, algorithm);
  }

  public static void backward_hmm(hmm hmm, observations o, int algorithm) {
    trebaJNI.backward_hmm(hmm.getCPtr(hmm), hmm, observations.getCPtr(o), o, algorithm);
  }

  public static double train_viterbi(wfsa fsm, observations o, int maxiterations, double maxdelta) {
    return trebaJNI.train_viterbi(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, maxiterations, maxdelta);
  }

  public static double train_baum_welch(wfsa fsm, observations o, int maxiterations, double maxdelta, int vb) {
    return trebaJNI.train_baum_welch(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, maxiterations, maxdelta, vb);
  }

  public static double train_bw(wfsa fsm, observations o, int maxiterations, double maxdelta) {
    return trebaJNI.train_bw(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o, maxiterations, maxdelta);
  }

  public static double train_viterbi_bw(wfsa fsm, observations o) {
    return trebaJNI.train_viterbi_bw(wfsa.getCPtr(fsm), fsm, observations.getCPtr(o), o);
  }

  public static SWIGTYPE_p_void trellis_fill_bw(SWIGTYPE_p_void threadargs) {
    long cPtr = trebaJNI.trellis_fill_bw(SWIGTYPE_p_void.getCPtr(threadargs));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static int main(int argc, SWIGTYPE_p_p_char argv) {
    return trebaJNI.main(argc, SWIGTYPE_p_p_char.getCPtr(argv));
  }

  public static wfsa dffa_to_wfsa(dffa dffa) {
    long cPtr = trebaJNI.dffa_to_wfsa(dffa.getCPtr(dffa), dffa);
    return (cPtr == 0) ? null : new wfsa(cPtr, false);
  }

  public static dffa dffa_state_merge(observations o, double alpha, int test, int recursive) {
    long cPtr = trebaJNI.dffa_state_merge(observations.getCPtr(o), o, alpha, test, recursive);
    return (cPtr == 0) ? null : new dffa(cPtr, false);
  }

  public static dffa dffa_mdi(observations o, double alpha) {
    long cPtr = trebaJNI.dffa_mdi(observations.getCPtr(o), o, alpha);
    return (cPtr == 0) ? null : new dffa(cPtr, false);
  }

  public static dffa observations_to_dffa(observations o) {
    long cPtr = trebaJNI.observations_to_dffa(observations.getCPtr(o), o);
    return (cPtr == 0) ? null : new dffa(cPtr, false);
  }

  public static dffa dffa_init(int num_states, int alphabet_size) {
    long cPtr = trebaJNI.dffa_init(num_states, alphabet_size);
    return (cPtr == 0) ? null : new dffa(cPtr, false);
  }

  public static int dffa_chi2_test(dffa dffa, int qu, int qv, double alpha) {
    return trebaJNI.dffa_chi2_test(dffa.getCPtr(dffa), dffa, qu, qv, alpha);
  }

  public static void log1plus_taylor_init_wrapper() {
    trebaJNI.log1plus_taylor_init_wrapper();
  }

  public static void log1plus_init_wrapper() {
    trebaJNI.log1plus_init_wrapper();
  }

  public static void log1plus_free_wrapper() {
    trebaJNI.log1plus_free_wrapper();
  }

}
