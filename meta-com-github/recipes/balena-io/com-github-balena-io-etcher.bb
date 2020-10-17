SUMMARY = "Burn images to SD cards & USB drives, safely and easily."
HOMEPAGE = "https://etcher.io/"
# HOMEPAGE = "https://github.com/balena-io/etcher/"
LICENSE = "Apache-2.0"

PV = "1.5.109"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build

SRCNAME = "balenaEtcher-${PV}-x64.AppImage"
SRC_URI = "https://github.com/balena-io/etcher/releases/download/v${PV}/${SRCNAME};name=amd64"
# SRC_URI[amd64.md5sum] = ""
# SRC_URI[amd64.sha256sum] = ""
SRC_URI[amd64.sha512sum] = "56ccf88ad6e6949598903df452bb8bb83036a5f7c5b81cc1bbadfc0915d3ea37a68d005df98aed85ca2d2f53958ee7aec4817663c2dfc158a90a88a7d2978e5d"

do_build[dirs] = "${S}"
do_build(){
    install -d \
        "${D}/usr/local/bin/"
    install -T \
        "${WORKDIR}/${SRCNAME}" \
        "${D}/usr/local/bin/balenaEtcher"
}
