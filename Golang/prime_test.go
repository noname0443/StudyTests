package golang

import (
	"testing"
)

func TestIsPrime(t *testing.T) {
	primes := []int{2, 3, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251}
	for _, v := range primes {
		if !IsPrime(v) {
			t.Fail()
		}
	}
}

func TestIsNotPrime(t *testing.T) {
	primes := []int{4, 6, 8, 10, 556, 985, 294, 102398, 333, 121, 55, 90, 555, -32, 32, 999, 18, 158, 242, 240}
	for _, v := range primes {
		if IsPrime(v) {
			t.Fail()
		}
	}
}
