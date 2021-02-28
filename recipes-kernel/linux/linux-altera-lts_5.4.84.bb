LINUX_VERSION = "5.4.84"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "495c4b3595bb150b7a8320c89501ae7b33576898"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_cyclone5 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_arria5 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_arria10 = " file://${THISDIR}/config/lbdaf.scc "
SRC_URI_append_stratix10 = " file://${THISDIR}/config/jffs2.scc file://${THISDIR}/config/gpio_sys.scc "
SRC_URI_append_agilex = " file://${THISDIR}/config/jffs2.scc file://${THISDIR}/config/gpio_sys.scc "

