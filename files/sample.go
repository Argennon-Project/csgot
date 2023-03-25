// generated from sample.csgo

package selector

import "github.com/consensys/gnark/frontend"


func Partition(rightSide bool, pivotPosition frontend.Variable, input []frontend.Variable) (out []frontend.Variable) {
	out = make([]frontend.Variable, len(input))
	var mask []frontend.Variable
	// we create a bit mask to multiply with the input.
	if rightSide {
		mask = stepMask(len(input), pivotPosition, 0, 1)
	} else {
		mask = stepMask(len(input), pivotPosition, 1, 0)
	}
	for i := 0; i < len(out); i++ {
		out[i] = api.Mul(mask[i], input[i])
	}
	return
}

// stepMask generates a step like function into an output array of a given length.
// The output is an array of length outputLen,
// such that its first stepPosition elements are equal to startValue and the remaining elements are equal to
// endValue. Note that outputLen cannot be a circuit variable.
//
// We must have stepPosition >= 0 and stepPosition <= outputLen, otherwise a proof cannot be generated.
// This function panics when outputLen is less than 2.
func stepMask(outputLen int, stepPosition, startValue, endValue frontend.Variable) []frontend.Variable {
	if outputLen < 2 {
		panic("the output len of StepMask must be >= 2")
	}
	// get the output as a hint
	var out []frontend.Variable
	out, _ = api.Compiler().NewHint(stepOutput, outputLen, stepPosition, startValue, endValue)


	// add the boundary constraints:
	api.AssertIsEqual(api.Mul(api.Sub(out[0], startValue), stepPosition), 0)
	api.AssertIsEqual(api.Mul(api.Sub(out[len(out)-1], endValue), api.Sub(len((out)), stepPosition)), 0)

	// add constraints for the correct form of a step function that steps at the stepPosition
	for i := 1; i < len(out); i++ {
		api.AssertIsEqual(api.Mul(api.Sub(out[i], out[i-1]), api.Sub(i, stepPosition)), 0)
	}
	return out
}


