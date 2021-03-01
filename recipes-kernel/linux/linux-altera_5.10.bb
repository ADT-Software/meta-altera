LINUX_VERSION = "5.8"

SRCREV = "f7700e50b1d0fedadecefc75f3aa4d36c28d0a56"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_cyclone5 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_arria5 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_arria10 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_stratix10 = " file://${THISDIR}/config/jffs2.scc file://${THISDIR}/config/gpio_sys.scc "
SRC_URI_append_agilex = " file://${THISDIR}/config/jffs2.scc file://${THISDIR}/config/gpio_sys.scc "

