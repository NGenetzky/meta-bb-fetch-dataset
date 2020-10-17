SUMMARY = "sigrok-cli is a command-line frontend for sigrok."
HOMEPAGE = "https://sigrok.org/wiki/Downloads#Linux_AppImage_binaries"

PV = "0.7.1"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build
SRCFILENAME="sigrok-cli-${PV}-x86_64.AppImage"
SRC_URI = "https://sigrok.org/download/binary/sigrok-cli/${SRCFILENAME}"
SRC_URI[sha256sum] = "6efc5abd2797b7ffcbe6beb5fd4338e54b699db678c9d847b275456e5d4856f4"

inherit install_bin_appimage
do_build() {
    install_bin_appimage_with_name "${WORKDIR}/${SRCFILENAME}" "sigrok-cli"
}
