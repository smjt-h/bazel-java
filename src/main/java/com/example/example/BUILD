java_library(
    name = "example",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/java/com/example/package2",
        "//third_party:dagger",
        "@maven//:com_google_guava_guava",
        "@maven//:javax_inject_javax_inject",
    ],
)

java_binary(
    name = "ExampleMain",
    runtime_deps = [":example"],
)
