format:
	lein cljfmt fix

check-format:
	lein cljfmt check

checks:
	check-format check-kondo

check-kondo:
	clj-kondo --lint src

test:
	lein test

.PHONY: test