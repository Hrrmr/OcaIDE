package ocaml.typeHovers;

import ocaml.util.Misc;

/**
 * A type annotation, from a ".annot" file generated by the "-dtypes" option of the OCaml compiler.
 */
public class TypeAnnotation {
	/** beginning offset in code */
	private final int begin;
	/** end offset in code */
	private final int end;
	/** the type inferred by the compiler for the expression ranging from <code>begin</code> to <code>end</code> */
	private final String type;

	public TypeAnnotation(int begin, int end, String type) {
		this.begin = begin;
		this.end = end;
		this.type = Misc.beautify(type);
	}

	public int getBegin() {
		return begin;
	}

	public int getEnd() {
		return end;
	}

	public String getType() {
		return type;
	}
}
