DESCRIPTION = "Prints Hello World"
PN = 'HelloWorld'
PV = '1.0'
python do_build () {
    bb.plain ("********************");
    bb.plain ("* *");
    bb.plain ("* Hello, World Recpie");
    bb.plain ("* *");
    bb.plain ("********************");
}
