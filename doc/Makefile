all: doc

api:
	cd ..
	lein doc

github: api
	ghp-import -m "Generate documentation" -b gh-pages dist/
	git push origin gh-pages
