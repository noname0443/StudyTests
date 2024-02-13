#include "pch.h"

TEST(IsPrime, Primes) {
	int primes [] { 2, 3, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251 };
	for (int i = 0; i < 20; i++) {
		EXPECT_TRUE(IsPrime(primes[i]));
	}
}

TEST(IsPrime, NotPrimes) {
	int primes[]{ 4, 6, 8, 10, 556, 985, 294, 102398, 333, 121, 55, 90, 555, -32, 32, 999, 18, 158, 242, 240 };
	for (int i = 0; i < 20; i++) {
		EXPECT_FALSE(IsPrime(primes[i]));
	}
}