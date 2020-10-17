SUMMARY = "PulseView is a Qt based logic analyzer, oscilloscope and MSO GUI for sigrok."
HOMEPAGE = "https://sigrok.org/wiki/Downloads#Linux_AppImage_binaries"

PV = "0.4.2"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build
SRCFILENAME="PulseView-${PV}-x86_64.AppImage"
SRC_URI = "https://sigrok.org/download/binary/pulseview/${SRCFILENAME}"
SRC_URI[sha256sum] = "aed42a428c202d799a0374b32ad6500be9197725c376f1d9431b6ad3c28fdbf1"

inherit install_bin_appimage
do_build() {
    install_bin_appimage_with_name "${WORKDIR}/${SRCFILENAME}" "pulseview"
}
