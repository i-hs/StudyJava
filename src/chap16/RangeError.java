package chap16;


// -- 범위 밖 예외 -- //
class RangeError extends RuntimeException{
	RangeError(int n) { super("범위 밖 값:"+n);}
}

// -- 범위 밖 예외 (매개 변수) -- //
class ParameterRangeError extends RangeError{
	ParameterRangeError(int n){super(n);}
}

// -- 범위 밖 예외(반환값) -- //
class ResultRangeError extends RangeError{
	ResultRangeError(int n){super(n);}
}