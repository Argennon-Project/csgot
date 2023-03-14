// generated from test.csgo
package main

// stepMask generates a step like function into an output array of a given length.
// The output is an array of length outputLen,
// such that its first stepPosition elements are equal to startValue and the remaining elements are equal to
// endValue. Note that outputLen cannot be a circuit variable.
//
// We must have stepPosition >= 0 and stepPosition <= outputLen, otherwise a proof cannot be generated.
// This function panics when outputLen is less than 2.
func stepMask(api frontend.API, outputLen int,
	stepPosition, startValue, endValue frontend.Variable) []frontend.Variable {
	if outputLen < 2 {
		panic("the output len of StepMask must be >= 2")
	}
	// get the output as a hint
	out, err := api.Compiler().NewHint(stepOutput, outputLen, stepPosition, startValue, endValue)
	if err != nil {
		panic(fmt.Sprintf("error in calling StepMask hint: %v", err))
	}

	// add the boundary constraints:
	api.AssertIsEqual(api.Mul(api.Sub(out[0], startValue), stepPosition), 0)
	api.AssertIsEqual(api.Mul(api.Sub(out[len(out)-1], endValue), api.Sub(len(out), stepPosition)), 0)

	// add constraints for the correct form of a step function that steps at the stepPosition
	for i := 1; i < len(out); i++ {
		api.AssertIsEqual(api.Mul(api.Sub(out[i], out[i-1]), api.Sub(i, stepPosition)), 0)
	}
	return out
}


