# Use 'D' to help be familiar for poky distros
D ??= "${IMAGE_ROOTFS}"
INSTALL_BIN_GO_BINDIR ??= "${D}/usr/local/bin"

install_bin_go_with_name(){
    # 1 is src, 2 is name at dest
    install -d "${INSTALL_BIN_GO_BINDIR}"
    install -T "${1}" "${INSTALL_BIN_GO_BINDIR}/${2}"
}

install_bin_go_files(){
    install -d "${INSTALL_BIN_GO_BINDIR}"
    install -t "${INSTALL_BIN_GO_BINDIR}" \
        "$@"
}
